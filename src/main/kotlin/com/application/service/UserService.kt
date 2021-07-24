package com.application.service

import com.application.domain.User

interface UserService {

    fun findById(id: Long): User

    fun save(user: User): User

    fun update(user: User): User

    fun delete(id: Long)

}
