package com.example.resume.Business.abstracts;

import com.example.resume.Entity.Dto.ExperienceDto;
import com.example.resume.Entity.concretes.Experience;

import java.util.List;

public interface ExperienceService {
    List<ExperienceDto> getall();
    Experience add (Experience experience);
}
