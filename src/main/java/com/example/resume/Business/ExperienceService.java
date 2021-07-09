package com.example.resume.Business;

import com.example.resume.DataAcces.ExperienceDao;
import com.example.resume.Dto.ExperienceDto;
import com.example.resume.Dto.Requests.ExperienceRequest;
import com.example.resume.Dto.converter.ExperienceDtoConverter;
import com.example.resume.Entity.Experience;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ExperienceService {

    private final ExperienceDao experienceDao;
    private final ExperienceDtoConverter dtoConverter;

    public ExperienceService(ExperienceDao experienceDao, ExperienceDtoConverter dtoConverter) {
        this.experienceDao = experienceDao;
        this.dtoConverter = dtoConverter;
    }


    public List<ExperienceDto> getall() {
        return experienceDao.findAll()
                .stream()
                .map(dtoConverter::convertToExperience)
                .collect(Collectors.toList());
    }


    public ExperienceDto add(ExperienceRequest experienceRequest) {
         Experience experience = new Experience();
         experience.copy(experienceRequest.getId(),
                        experienceRequest.getExperienceName(),
                 experienceRequest.getExperienceDescription());
         experienceDao.save(experience);
         return dtoConverter.convertToExperience(experience);
    }
}
