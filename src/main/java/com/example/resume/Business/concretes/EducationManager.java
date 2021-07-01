package com.example.resume.Business.concretes;

import com.example.resume.Business.abstracts.EducationService;
import com.example.resume.DataAcces.EducationDao;
import com.example.resume.Entity.Dto.EducationDto;
import com.example.resume.Entity.Dto.converter.EducationDtoConverter;
import com.example.resume.Entity.concretes.Education;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class EducationManager implements EducationService {

    private final EducationDao educationDao;
    private final EducationDtoConverter dtoConverter;

    public EducationManager(EducationDao educationDao, EducationDtoConverter dtoConverter) {
        this.educationDao = educationDao;
        this.dtoConverter = dtoConverter;
    }

    @Override
    public boolean Add(Education education) {
       if (!checkYear(education)){
            return false;
       }else {
           this.educationDao.save(education);
           return true;

       }
    }

    @Override
    public List<EducationDto> getall() {
       return educationDao.findAll()
               .stream()
               .map(dtoConverter::convertToEducation)
               .collect(Collectors.toList());
    }

    @Override
    public boolean checkYear(Education education) {
        if (education.getEndYear().isAfter(LocalDate.now())){
            return false;
        }
        return true;
    }
}
