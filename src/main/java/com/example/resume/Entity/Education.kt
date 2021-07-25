package com.example.resume.Entity

import com.fasterxml.jackson.annotation.JsonIgnore
import java.time.LocalDate

import javax.persistence.*
import javax.validation.constraints.NotBlank
import javax.validation.constraints.NotNull


@Entity
@Table(name = "education")
data class Education(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    val id : Int? = 0,


    @Column(name = "school_name")
    val schoolName: String? = "",

    @Column(name = "first_year")
    val firstYear : LocalDate? = null,

    @Column(name = "end_year")
    val endYear : LocalDate? =null,

    @OneToMany(mappedBy = "education")
    @JsonIgnore
    val resume: List<Resume>? = null
)

