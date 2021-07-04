package com.example.resume.Entity.concretes

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
    @field:NotBlank(message = "okul bilgisi boş olamaz")
    val schoolName: String? = "",


    @Column(name = "first_year")
    @field:NotNull(message = "tarih boş geçilemez")
    val firstYear : LocalDate? = null,

    @Column(name = "end_year")
    val endYear : LocalDate? =null,

    @OneToMany(mappedBy = "education")
    @JsonIgnore()
    val resume: List<Resume>? = null


) {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Education

        if (id != other.id) return false
        if (schoolName != other.schoolName) return false
        if (firstYear != other.firstYear) return false
        if (endYear != other.endYear) return false
        if (resume != other.resume) return false

        return true
    }

    override fun hashCode(): Int {
        var result = id ?: 0
        result = 31 * result + (schoolName?.hashCode() ?: 0)
        result = 31 * result + (firstYear?.hashCode() ?: 0)
        result = 31 * result + (endYear?.hashCode() ?: 0)
        result = 31 * result + (resume?.hashCode() ?: 0)
        return result
    }


}