package com.example.resume.Core.User


import org.hibernate.annotations.GenericGenerator


import javax.persistence.*
import javax.validation.constraints.Email
import javax.validation.constraints.NotBlank

@Entity
@Table(name = "user")
data class User (
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID" , strategy = "org.hibernate.id.UUIDGenerator")
    val id: String?="",

    @Column(name = "first_name")
    @field:NotBlank
    val firstName: String?="",

    @Column(name = "last_name")
    @field:NotBlank
    val lastName: String?="",

    @Column(name = "email", unique = true)
    @field:Email
    @field:NotBlank
    val email: String?="",

    @Column(name = "password")
    @field:NotBlank
    private val password: String?="" ,

    @Column(name = "enabled")
    val enabled: Boolean?= true


)