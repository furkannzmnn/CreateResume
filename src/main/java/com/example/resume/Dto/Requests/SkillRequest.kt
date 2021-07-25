package com.example.resume.Dto.Requests

import com.example.resume.Entity.Resume
import java.time.LocalDateTime

data class SkillRequest(
    val id : Int?,
    val skillName: String?,
    val skillLevel: String?,
    val createdAt: LocalDateTime? = LocalDateTime.now(),
    val resume: List<Resume>?
)
