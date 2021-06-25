package com.example.resume.Entity.concretes

import com.fasterxml.jackson.annotation.JsonIgnore
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

    @OneToMany(mappedBy = "experience")
    @JsonIgnore()
    val resume: List<Resume>? = null








)




