package com.example.resume.Dto.Requests

import java.util.*
import javax.validation.constraints.Email
import javax.validation.constraints.NotBlank

data class UserRequest(

    var id: UUID?,

    @field:NotBlank
    val firstName: String?,

    @field:NotBlank
    val lastName: String? ,

    @field:Email
    @field:NotBlank
    val email: String?,

    @field:NotBlank
    val password: String?
)
