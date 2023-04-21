package com.auth.user.data.entity

import com.auth.user.domain.dto.UserDTO
import org.modelmapper.ModelMapper
import javax.persistence.*

@Entity
@Table(name = "usuario")
data class User(

    @get:Id
    @get:GeneratedValue
    @get:Column(name = "id")
    var id: Long,

    @get:Column(name = "title")
    var title: String,

    )