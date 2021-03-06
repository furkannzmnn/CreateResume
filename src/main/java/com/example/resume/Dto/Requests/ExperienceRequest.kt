package com.example.resume.Dto.Requests

import com.example.resume.Entity.Resume
import com.fasterxml.jackson.annotation.JsonIgnore
import java.time.LocalDateTime


data class ExperienceRequest(
    val id: Int?=0,
    val experienceName: String?="",
    val experienceDescription: String?="",
    val createdAt: LocalDateTime? = LocalDateTime.now(),
    @JsonIgnore
    val resume: List<Resume>?

)

