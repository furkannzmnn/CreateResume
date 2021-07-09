package com.example.resume.Dto.Requests

import com.example.resume.Entity.Resume
import com.fasterxml.jackson.annotation.JsonIgnore
import java.time.LocalDate
import javax.validation.constraints.NotBlank
import javax.validation.constraints.NotNull

data class EducationRequest(
    val id: Int?,

    @field:NotBlank(message = "okul bilgisi boş olamaz")
    val schoolName: String?,

    @field:NotNull(message = "tarih boş geçilemez")
    val firstYear: LocalDate?,

    val endYear: LocalDate?,

    @JsonIgnore
    val resume: List<Resume>?
)
