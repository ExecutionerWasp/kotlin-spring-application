package com.application.service.impl

import com.application.domain.Role
import com.application.domain.UserRole
import com.application.exception.Exceptions
import com.application.repositpry.UserRoleRepository
import com.application.service.UserRoleService
import org.springframework.stereotype.Service
import java.util.*
import kotlin.collections.ArrayList

@Service
class UserRoleServiceImpl(private val userRoleRepository: UserRoleRepository) : UserRoleService {
    override fun roles(): ArrayList<UserRole> {
        return userRoleRepository.findAll() as ArrayList<UserRole>
    }

    override fun role(role: Role): UserRole {
        val type = userRoleRepository.findByType(role).orElse(null)
        if (Objects.isNull(type)) {
            throw Exceptions.UserRoleNotFoundException()
        }
        return type
    }

    override fun save(role: UserRole): UserRole {
        return userRoleRepository.save(role)
    }

    override fun update(role: UserRole): UserRole {
        return userRoleRepository.save(role)
    }

    override fun delete(id: Long) {
        userRoleRepository.deleteById(id)
    }
}
