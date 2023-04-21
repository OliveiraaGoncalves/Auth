package com.auth.user.data.local

import com.auth.user.data.entity.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Component

@Component
interface UserDataSourceRepository: JpaRepository<User, Long> {
}