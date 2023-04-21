package com.auth.user.domain

import com.auth.user.domain.dto.UserDTO
import org.springframework.stereotype.Service

interface UserUseCase {
    fun save(userDTO: UserDTO)
    fun getUser(userDTO: UserDTO): UserDTO
}

@Service
class UserUseCaseImpl(
    private val userRepository: UserRepository
) : UserUseCase {
    override fun save(userDTO: UserDTO) {
        userRepository.save(userDTO)
    }

    override fun getUser(userDTO: UserDTO): UserDTO {
        return userRepository.findById(userDTO)
    }
}