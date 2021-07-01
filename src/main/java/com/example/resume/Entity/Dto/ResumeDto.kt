package com.example.resume.Entity.Dto

import com.example.resume.Entity.concretes.Education
import com.example.resume.Entity.concretes.Experience
import com.fasterxml.jackson.annotation.JsonAnySetter
import java.time.LocalDate


data class ResumeDto(

    val id: Int?,
    val experience: Experience?,
    val education: Education?

)



