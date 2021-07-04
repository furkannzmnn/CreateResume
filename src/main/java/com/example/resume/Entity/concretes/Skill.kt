package com.example.resume.Entity.concretes

import com.fasterxml.jackson.annotation.JsonIgnore
import java.time.LocalDateTime
import javax.persistence.*

@Entity
@Table(name = "skills")
data class Skill(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name="id")
    val id : Int?=0,

    @Column(name = "skill_name")
    val skillName: String? ="",

    @Column(name = "skill_level")
    val skillLevel: String?="",

    @Column(name = "created_at")
    val createdAt: LocalDateTime? =LocalDateTime.now(),

    @OneToMany(mappedBy = "skill")
    @JsonIgnore
    val resume: List<Resume>?=null
)
