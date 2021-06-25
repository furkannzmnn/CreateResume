package com.example.resume.Business.concretes;

import com.example.resume.Business.abstracts.EducationService;
import com.example.resume.DataAcces.EducationDao;
import com.example.resume.Entity.concretes.Education;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EducationManager implements EducationService {

    private final EducationDao educationDao;

    public EducationManager(EducationDao educationDao) {
        this.educationDao = educationDao;
    }

    @Override
    public Education add(Education education) {
        return educationDao.save(education);
    }

    @Override
    public List<Education> getall() {
        return educationDao.findAll();
    }
}
