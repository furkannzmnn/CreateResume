package com.example.resume.Entity.concretes

import javax.persistence.*


@Entity
@Table(name="resume")
data class Resume(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    val id : Int? = 0,

    @ManyToOne()
    @JoinColumn(name = "experience_id")
    val experience: Experience? = null,


    @ManyToOne()
    @JoinColumn(name = "education_id")
    val education: Education? = null






)
