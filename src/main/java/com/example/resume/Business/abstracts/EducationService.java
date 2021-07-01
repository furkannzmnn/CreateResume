package com.example.resume.Business.abstracts;

import com.example.resume.Entity.Dto.EducationDto;
import com.example.resume.Entity.concretes.Education;

import java.util.List;

public interface EducationService {
    boolean Add(Education education);
    List<EducationDto>getall();

    boolean checkYear (Education education);
}
