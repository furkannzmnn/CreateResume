package com.example.resume.Entity.concretes

import javax.persistence.*


@Entity
@Table(name="resume")
data class Resume(

    // TODO: 01.07.2021 SCHOOL DEPARTMENT , SKİLSS EKLENECEK VE DTO OLUŞTURULACAK
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    val id : Int? = 0,

    @ManyToOne()
    @JoinColumn(name = "experience_id")
    val experience: Experience? = null,


    @ManyToOne()
    @JoinColumn(name = "education_id")
    val education: Education? = null,

    @ManyToOne
    @JoinColumn(name = "skill_id")
    val skill: Skill?=null

) {

    constructor() : this(id = 0)
}