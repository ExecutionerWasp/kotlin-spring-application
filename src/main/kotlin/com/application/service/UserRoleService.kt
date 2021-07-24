package com.application.service

import com.application.domain.Role
import com.application.domain.UserRole

interface UserRoleService {

    fun roles(): ArrayList<UserRole>

    fun role(role: Role): UserRole

    fun save(role: UserRole): UserRole

    fun update(role: UserRole): UserRole

    fun delete(id: Long)

}
