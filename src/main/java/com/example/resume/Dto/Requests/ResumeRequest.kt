package com.example.resume.Dto.Requests

import com.example.resume.Entity.Education
import com.example.resume.Entity.Experience
import com.example.resume.Entity.Skill

data class ResumeRequest(
    val id : Int?,
    val experience: Experience?,
    val education: Education?,
    val skill: Skill?
)
