package com.example.resume.Business.abstracts;

import com.example.resume.Entity.concretes.Experience;

import java.util.List;

public interface ExperienceService {
    List<Experience> getall();
    Experience add (Experience experience);
}
