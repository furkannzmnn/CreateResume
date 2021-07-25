package com.example.resume.Entity

import com.fasterxml.jackson.annotation.JsonIgnore

import net.bytebuddy.asm.Advice
import java.time.LocalDateTime
import javax.persistence.*


@Table(name="experience")
@Entity
 data class Experience(
    @field:Id
    @field:GeneratedValue(strategy = GenerationType.IDENTITY)

    @field:Column(name="id")
    val id: Int? = 0,

    @field:Column(name="experience_name")
    val experienceName: String? = "",

    @field:Column(name = "experience_description")
    val experienceDescription: String? = "",

    @field:Column(name = "created_at")
    val createdAt: LocalDateTime? = LocalDateTime.now(),

    @OneToMany(mappedBy = "experience")
    @JsonIgnore
    val resume: List<Resume>? = null

)
