package com.auth.user.data

import com.auth.user.data.local.UserDataSourceRepository
import com.auth.user.data.mapper.UserMapper
import com.auth.user.domain.UserRepository
import com.auth.user.domain.dto.UserDTO
import org.springframework.stereotype.Repository

@Repository
class UserRepositoryImpl(
    private val userRepository: UserDataSourceRepository,
    private val modelMapper: UserMapper
) : UserRepository {
    override fun save(userDTO: UserDTO) {
        userRepository.save(modelMapper.fromEntity(userDTO))
    }

    override fun findById(userDTO: UserDTO): UserDTO =
        modelMapper.fromDTO(userRepository.findById(userDTO.id).get())
}