package com.example.resume.Business;

import com.example.resume.DataAcces.EducationDao;
import com.example.resume.Dto.EducationDto;
import com.example.resume.Dto.Requests.EducationRequest;
import com.example.resume.Dto.converter.EducationDtoConverter;
import com.example.resume.Entity.Education;
import com.example.resume.Exception.CustomException.EducationInvalidException;
import com.example.resume.Exception.CustomException.ExperienceInvalidException;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class EducationService {

    private static final String DATE_İNVALİD_MSG =
            "Okul bitis tarihi şimdiden geç olamaz! ";
    private final EducationDao educationDao;
    private final EducationDtoConverter dtoConverter;

    public EducationService(EducationDao educationDao, EducationDtoConverter dtoConverter) {
        this.educationDao = educationDao;
        this.dtoConverter = dtoConverter;
    }

    public EducationDto Add(EducationRequest educationRequest) {
        if (!checkYear(educationRequest)) {
            throw new EducationInvalidException(DATE_İNVALİD_MSG + educationRequest.getEndYear());

        } else {
            Education education = new Education(
                    educationRequest.getId(),
                    educationRequest.getSchoolName(),
                    educationRequest.getFirstYear(),
                    educationRequest.getEndYear(),
                    educationRequest.getResume()
            );
           return dtoConverter.convertToEducation(educationDao.save(education));


        }
    }


    public List<EducationDto> getall() {
        return educationDao.findAll()
                .stream()
                .map(dtoConverter::convertToEducation)
                .collect(Collectors.toList());
    }


    private boolean checkYear(EducationRequest education) {
        if (education.getEndYear().isAfter(LocalDate.now())) {
            return false;
        }
        return true;
    }
}
