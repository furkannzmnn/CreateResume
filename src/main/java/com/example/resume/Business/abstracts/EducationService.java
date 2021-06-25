package com.example.resume.Business.abstracts;

import com.example.resume.Entity.concretes.Education;

import java.util.List;

public interface EducationService {
    Education add(Education education);
    List<Education>getall();
}
