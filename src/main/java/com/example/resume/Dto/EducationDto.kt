package com.example.resume.Dto
import java.time.LocalDate



data class EducationDto(
    val id: Int?,
    val schoolName: String?,
    val firstYear: LocalDate?,
    val endYear: LocalDate?
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as EducationDto

        if (id != other.id) return false
        if (schoolName != other.schoolName) return false
        if (firstYear != other.firstYear) return false
        if (endYear != other.endYear) return false

        return true
    }

    override fun hashCode(): Int {
        var result = id ?: 0
        result = 31 * result + (schoolName?.hashCode() ?: 0)
        result = 31 * result + (firstYear?.hashCode() ?: 0)
        result = 31 * result + (endYear?.hashCode() ?: 0)
        return result
    }

    override fun toString(): String {
        return "EducationDto(id=$id, schoolName=$schoolName, firstYear=$firstYear, endYear=$endYear)"
    }
}