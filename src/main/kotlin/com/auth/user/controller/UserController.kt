package com.auth.user.controller

import com.auth.user.controller.route.UserPath.USER_GET
import com.auth.user.controller.route.UserPath.USER_HOME_CONTROLLER
import com.auth.user.domain.UserUseCase
import com.auth.user.domain.dto.UserDTO
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(USER_HOME_CONTROLLER)
class UserController(
    private val userUseCase: UserUseCase
) {
    @GetMapping(USER_GET)
    fun getUser(@RequestBody userDTO: UserDTO) {
        println(userDTO.title)
        userUseCase.getUser(userDTO)
    }
}