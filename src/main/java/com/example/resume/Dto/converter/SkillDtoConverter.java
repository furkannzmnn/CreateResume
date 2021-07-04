package com.example.resume.Dto.converter;

import com.example.resume.Dto.SkillDto;
import com.example.resume.Entity.concretes.Skill;
import org.springframework.stereotype.Component;

@Component
public class SkillDtoConverter {

    public SkillDto convertToSkillDto(Skill from){

        return new SkillDto(
                from.getId(),
                from.getSkillName(),
                from.getSkillLevel()
        );
    }
}
