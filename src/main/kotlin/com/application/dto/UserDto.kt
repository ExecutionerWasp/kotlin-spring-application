package com.application.dto

import com.application.domain.User
import java.time.LocalDateTime

data class UserDto(
    private val login: String,
    private val password: String
) {
    fun toUser(): User {
        return User(null, login, password, LocalDateTime.now(), ArrayList())
    }
}
