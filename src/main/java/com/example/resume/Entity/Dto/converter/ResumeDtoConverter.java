package com.example.resume.Entity.Dto.converter;

import com.example.resume.Entity.Dto.EducationDto;
import com.example.resume.Entity.Dto.ResumeDto;
import com.example.resume.Entity.concretes.Resume;
import org.springframework.stereotype.Component;

@Component
public class ResumeDtoConverter {
    public ResumeDto convertToResume(Resume from){
        return new ResumeDto(
             from.getId(),
             from.getExperience(),
             from.getEducation() );
    }
}
