package com.example.resume.Business;

import com.example.resume.DataAcces.SkillDao;
import com.example.resume.Dto.SkillDto;
import com.example.resume.Dto.converter.SkillDtoConverter;
import com.example.resume.Entity.Skill;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SkillService {

    private final SkillDao skillDao;
    private final SkillDtoConverter skillDtoConverter;

    public SkillService(SkillDao skillDao, SkillDtoConverter skillDtoConverter) {
        this.skillDao = skillDao;
        this.skillDtoConverter = skillDtoConverter;
    }


    public List<SkillDto> getall() {
        return this.skillDao.findAll()
                .stream()
                .map(skillDtoConverter::convertToSkillDto)
                .collect(Collectors.toList());
    }


    public Skill add(Skill skill) {
        return this.skillDao.save(skill);
    }
}
