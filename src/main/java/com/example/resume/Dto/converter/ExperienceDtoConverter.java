package com.example.resume.Dto.converter;

import com.example.resume.Dto.ExperienceDto;
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
