package com.application.domain

import javax.persistence.*

@Entity
class UserRole(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long?,
    val name: String?,
    @Enumerated(value = EnumType.STRING)
    @Column(unique = true)
    val type: Role = Role.USER
) {
    constructor() : this(null, null, Role.USER)
}
