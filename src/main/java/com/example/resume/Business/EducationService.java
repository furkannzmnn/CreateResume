package com.example.resume.Business;

import com.example.resume.DataAcces.EducationDao;
import com.example.resume.Dto.EducationDto;
import com.example.resume.Dto.Requests.EducationRequest;
import com.example.resume.Dto.converter.EducationDtoConverter;
import com.example.resume.Entity.Education;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class EducationService {

    private final EducationDao educationDao;
    private final EducationDtoConverter dtoConverter;

    public EducationService(EducationDao educationDao, EducationDtoConverter dtoConverter) {
        this.educationDao = educationDao;
        this.dtoConverter = dtoConverter;
    }


    public boolean Add(EducationRequest educationRequest) {
       if (!checkYear(educationRequest)){
            return false;
       }else {
           Education education = new Education();
           education.copy(educationRequest.getId(),
                   educationRequest.getSchoolName(),
                   educationRequest.getFirstYear(),
                   educationRequest.getEndYear());
           educationDao.save(education);
           return true;

       }
    }


    public List<EducationDto> getall() {
       return educationDao.findAll()
               .stream()
               .map(dtoConverter::convertToEducation)
               .collect(Collectors.toList());
    }


    public boolean checkYear(EducationRequest education) {
        if (education.getEndYear().isAfter(LocalDate.now())){
            return false;
        }
        return true;
    }
}
