package com.application.service.impl

import com.application.domain.Role
import com.application.domain.User
import com.application.exception.Exceptions
import com.application.repositpry.UserRepository
import com.application.service.UserRoleService
import com.application.service.UserService
import org.springframework.stereotype.Service
import java.util.*

@Service
class UserServiceImpl(
    private val userRepository: UserRepository,
    private val userRoleService: UserRoleService
) : UserService {
    override fun findById(id: Long): User {
        val user = userRepository.findById(id).orElse(null)
        if (Objects.isNull(user)) {
            throw Exceptions.UserNotFoundException()
        }
        return user
    }

    override fun save(user: User): User {
        if (Objects.isNull(user.roles) || user.roles.isEmpty()) {
            user.roles.add(userRoleService.role(Role.USER))
        }
        return userRepository.save(user)
    }

    override fun update(user: User): User {
        return userRepository.save(user)
    }

    override fun delete(id: Long) {
        userRepository.deleteById(id)
    }
}
