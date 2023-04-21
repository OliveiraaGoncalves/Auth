package com.auth

import org.modelmapper.ModelMapper
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class ApplicationConfig {
    @Bean
    fun modelMapper(): ModelMapper? {
        return ModelMapper()
    }
}