package com.application.controller

import com.application.domain.User
import com.application.dto.UserDto
import com.application.service.UserService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/user")
class UserController(private val userService: UserService) {

    @GetMapping("/{id}")
    fun findById(@PathVariable id: Long): ResponseEntity<User> {
        return ResponseEntity.ok(userService.findById(id))
    }

    @PostMapping
    fun save(@RequestBody user: UserDto): ResponseEntity<User> {
        return ResponseEntity.ok(userService.save(user.toUser()))
    }

    @DeleteMapping("/{id}")
    fun delete(@PathVariable id: Long): ResponseEntity<Any> {
        userService.delete(id)
        return ResponseEntity.ok().build()
    }
}
