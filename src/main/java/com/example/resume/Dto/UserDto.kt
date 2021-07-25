package com.example.resume.Dto

import java.util.*

data class UserDto(
    val id: UUID?,
    val firstName: String?,
    val lastName: String?,
    val email: String?,
    val password: String?
)