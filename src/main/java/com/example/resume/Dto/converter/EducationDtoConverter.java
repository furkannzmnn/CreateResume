package com.example.resume.Dto.converter;

import com.example.resume.Dto.EducationDto;
import com.example.resume.Entity.Education;
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
