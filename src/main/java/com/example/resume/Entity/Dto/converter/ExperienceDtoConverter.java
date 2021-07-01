package com.example.resume.Entity.Dto.converter;

import com.example.resume.Entity.Dto.ExperienceDto;
import com.example.resume.Entity.concretes.Experience;
import org.springframework.stereotype.Component;

@Component
public class ExperienceDtoConverter {

    public ExperienceDto convertToExperience(Experience from) {

        return new ExperienceDto(
                from.getId(),
                from.getExperienceName(),
                from.getExperienceDescription()
        );
    }
}
