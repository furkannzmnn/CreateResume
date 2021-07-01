package com.example.resume.Business.concretes;

import com.example.resume.Business.abstracts.ExperienceService;
import com.example.resume.DataAcces.ExperienceDao;
import com.example.resume.Entity.Dto.ExperienceDto;
import com.example.resume.Entity.Dto.converter.EducationDtoConverter;
import com.example.resume.Entity.Dto.converter.ExperienceDtoConverter;
import com.example.resume.Entity.concretes.Experience;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ExperienceManager implements ExperienceService {

    private final ExperienceDao experienceDao;
    private final ExperienceDtoConverter dtoConverter;

    public ExperienceManager(ExperienceDao experienceDao, ExperienceDtoConverter dtoConverter) {
        this.experienceDao = experienceDao;
        this.dtoConverter = dtoConverter;
    }

    @Override
    public List<ExperienceDto> getall() {
        return experienceDao.findAll()
                .stream()
                .map(dtoConverter::convertToExperience)
                .collect(Collectors.toList());
    }

    @Override
    public Experience add(Experience experience) {
        return experienceDao.save(experience);
    }
}
