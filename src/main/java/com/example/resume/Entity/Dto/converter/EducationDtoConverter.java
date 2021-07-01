package com.example.resume.Entity.Dto.converter;

import com.example.resume.Entity.Dto.EducationDto;
import com.example.resume.Entity.concretes.Education;
import org.springframework.stereotype.Component;

@Component
public class EducationDtoConverter{

    public EducationDto convertToEducation(Education from){

        return new EducationDto(from.getId(),
                from.getSchoolName(),
                from.getFirstYear(),
                from.getEndYear());

    }
}
