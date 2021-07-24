package com.application.exception

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ResponseStatus

class Exceptions {

    @ResponseStatus(value = HttpStatus.NOT_FOUND)
    class UserNotFoundException : RuntimeException("User not found")

    @ResponseStatus(value = HttpStatus.NOT_FOUND)
    class UserRoleNotFoundException : RuntimeException("User role not found")
}
