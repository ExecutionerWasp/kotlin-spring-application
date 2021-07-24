package com.application.controller

import com.application.domain.UserRole
import com.application.service.UserRoleService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/role")
class UserRoleController(private val userRoleService: UserRoleService) {

    @GetMapping("/list")
    fun roleList(): ResponseEntity<ArrayList<UserRole>> {
        return ResponseEntity.ok(userRoleService.roles())
    }

    @PostMapping
    fun saveRole(@RequestBody userRole: UserRole): ResponseEntity<UserRole> {
        return ResponseEntity.ok(userRoleService.save(userRole))
    }

    @DeleteMapping("/{id}")
    fun deleteRole(@PathVariable id: Long): ResponseEntity<Any> {
        userRoleService.delete(id)
        return ResponseEntity.ok().build()
    }
}
