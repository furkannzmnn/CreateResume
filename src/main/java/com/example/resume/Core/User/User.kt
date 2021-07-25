package com.example.resume.Core.User


import org.hibernate.annotations.GenericGenerator
import java.util.*
import javax.persistence.*

@Entity
@Table(name = "user")
data class User(
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID" , strategy = "org.hibernate.id.UUIDGenerator")
    var id: UUID? =null,

    @Column(name = "first_name")
    var firstName: String?="",

    @Column(name = "last_name")
    var lastName: String?="",

    @Column(name = "email", unique = true)
    var email: String?="",

    @Column(name = "password")
    var password: String?="",

    @Column(name = "enabled")
    val enabled: Boolean?= true


)