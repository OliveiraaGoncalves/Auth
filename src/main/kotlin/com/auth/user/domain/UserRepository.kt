package com.auth.user.domain

import com.auth.user.domain.dto.UserDTO

interface UserRepository{
    fun save(userDTO: UserDTO)
    fun findById(userDTO: UserDTO): UserDTO
}