package com.example.resume.Entity

import com.fasterxml.jackson.annotation.JsonIgnore

import net.bytebuddy.asm.Advice
import java.time.LocalDateTime
import javax.persistence.*


@Table(name="experience")
@Entity
 data class Experience(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name="id")
    val id: Int? = 0,

    @Column(name="experience_name")
    val experienceName: String? = "String",

    @Column(name = "experience_description")
    val experienceDescription: String? = "String",

    @Column(name = "created_at")
    val createdAt: LocalDateTime?= LocalDateTime.now(),

    @OneToMany(mappedBy = "experience")
    @JsonIgnore()
    val resume: List<Resume>? = null


){
    constructor():this(id=0)
 }



