package com.example.resume.Business;

import com.example.resume.DataAcces.ResumeDao;
import com.example.resume.Dto.Requests.ResumeRequest;
import com.example.resume.Dto.ResumeDto;
import com.example.resume.Dto.converter.ResumeDtoConverter;
import com.example.resume.Entity.Resume;
import com.example.resume.Exception.CustomException.ResumeNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ResumeService {

    private final static String RESUME_NOT_FOUND_MSG =
            "Resume with id not found";
    private final ResumeDao resumeDao;
    private final ResumeDtoConverter dtoConverter;


    public ResumeService(ResumeDao resumeDao, ResumeDtoConverter dtoConverter) {
        this.resumeDao = resumeDao;
        this.dtoConverter = dtoConverter;
    }


    public ResumeDto createResume(ResumeRequest resumeRequest) {
       Resume resume = new Resume(
               resumeRequest.getId(),
               resumeRequest.getExperience(),
               resumeRequest.getEducation(),
               resumeRequest.getSkill()
       );
       return dtoConverter.convertToResume(resumeDao.save(resume));

    }


    public List<ResumeDto> getall() {
        return resumeDao.findAll()
                .stream()
                .map(dtoConverter::convertToResume)
                .collect(Collectors.toList());
    }

    private Resume findById(int id) {
        return resumeDao.findById(id)
                .orElseThrow(
                        () -> new ResumeNotFoundException(String.format(RESUME_NOT_FOUND_MSG + id)));
    }

    protected void deleteById(int id) {

        if (resumeDao.existsById(id)) {
            resumeDao.deleteById(id);
        } else {
            throw new ResumeNotFoundException(String.format(RESUME_NOT_FOUND_MSG, id));
        }
    }


}
