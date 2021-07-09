package com.example.resume.Dto.Requests

import com.example.resume.Entity.Resume
import com.fasterxml.jackson.annotation.JsonIgnore
import java.time.LocalDateTime

data class ExperienceRequest(
    val id: Int?,
    val experienceName: String?,
    val experienceDescription: String?,
    val createdAt: LocalDateTime?,

    @JsonIgnore
    val resume: List<Resume>?

)

