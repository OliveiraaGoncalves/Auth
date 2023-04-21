package com.auth.user.data.mapper

import com.auth.user.data.entity.User
import com.auth.user.domain.dto.UserDTO
import org.modelmapper.ModelMapper
import org.springframework.stereotype.Component

interface UserMapper {
    fun fromDTO(user: User): UserDTO
    fun fromEntity(userDTO: UserDTO): User
}

@Component
class UserMapperImpl(
    private val modelMapper: ModelMapper
) : UserMapper {
    override fun fromDTO(user: User): UserDTO {
        return modelMapper.map(user, UserDTO::class.java)
    }

    override fun fromEntity(userDTO: UserDTO): User {
        return modelMapper.map(userDTO, User::class.java)
    }
}