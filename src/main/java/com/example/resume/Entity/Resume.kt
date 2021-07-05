package com.example.resume.Entity

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

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Resume

        if (id != other.id) return false
        if (experience != other.experience) return false
        if (education != other.education) return false
        if (skill != other.skill) return false

        return true
    }

    override fun hashCode(): Int {
        var result = id ?: 0
        result = 31 * result + (experience?.hashCode() ?: 0)
        result = 31 * result + (education?.hashCode() ?: 0)
        result = 31 * result + (skill?.hashCode() ?: 0)
        return result
    }
}