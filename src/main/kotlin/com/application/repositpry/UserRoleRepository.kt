package com.application.repositpry

import com.application.domain.Role
import com.application.domain.UserRole
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface UserRoleRepository : JpaRepository<UserRole, Long> {
    fun findByType(role: Role): Optional<UserRole>
}
