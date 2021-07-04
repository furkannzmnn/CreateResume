package com.example.resume.Dto

import java.time.LocalDate


data class ResumeDto(

    val id: Int?,
    val experienceName : String?,
    val schoolName: String?,
    val firstYear: LocalDate?,
    val endYear: LocalDate?,
    val experienceDescription: String?

)



