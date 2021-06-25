package com.example.resume.Entity.concretes

import com.fasterxml.jackson.annotation.JsonIgnore

import javax.persistence.*


@Entity
@Table(name = "education")
data class Education(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    val id : Int? = 0,

    @Column(name = "school_name")
    val schoolName: String? = "Okul Adı",

    @Column(name = "first_year")
    val firstYear : String? = "yyyy-mm-dd",

    @Column(name = "end_year")
    val endYear : String? = "yyyy-mm-dd",

    @OneToMany(mappedBy = "education")
    @JsonIgnore()
    val resume: List<Resume>? = null


)
