package com.example.resume.Dto
import java.time.LocalDate



data class EducationDto(
    val id: Int?,
    val schoolName: String?,
    val firstYear: LocalDate?,
    val endYear: LocalDate?
)