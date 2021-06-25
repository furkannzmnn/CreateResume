package com.example.resume.Business.concretes;

import com.example.resume.Business.abstracts.ExperienceService;
import com.example.resume.DataAcces.ExperienceDao;
import com.example.resume.Entity.concretes.Experience;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExperienceManager implements ExperienceService {

    private final ExperienceDao experienceDao;

    public ExperienceManager(ExperienceDao experienceDao) {
        this.experienceDao = experienceDao;
    }

    @Override
    public List<Experience> getall() {
        return experienceDao.findAll();
    }

    @Override
    public Experience add(Experience experience) {
        return experienceDao.save(experience);
    }
}
