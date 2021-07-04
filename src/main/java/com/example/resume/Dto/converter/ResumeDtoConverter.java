package com.example.resume.Dto.converter;

import com.example.resume.Dto.ResumeDto;
import com.example.resume.Entity.concretes.Resume;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class ResumeDtoConverter {
    public ResumeDto convertToResume(Resume from){
        return new ResumeDto(
                Objects.requireNonNull(from.getId()),
                from.getExperience().getExperienceName(),
                from.getEducation().getSchoolName(),
                from.getEducation().getFirstYear(),
                from.getEducation().getEndYear(),
                from.getExperience().getExperienceDescription()
                );
    }
}
