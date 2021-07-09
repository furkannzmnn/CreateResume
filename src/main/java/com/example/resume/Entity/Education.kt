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
    var id : Int? = 0,


    @Column(name = "school_name")
    var schoolName: String? = "",

    @Column(name = "first_year")
    var firstYear : LocalDate? = null,

    @Column(name = "end_year")
    var endYear : LocalDate? =null,

    @OneToMany(mappedBy = "education")

    var resume: List<Resume>? = null
) {

    fun copy(id:Int? = this.id,
            schoolName: String?=this.schoolName,
            firstYear: LocalDate?=this.firstYear,
            endYear: LocalDate?=this.endYear)=Education(id,schoolName, firstYear, endYear)

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