package com.example.resume.Business.concretes;

import com.example.resume.DataAcces.ResumeDao;
import com.example.resume.Dto.ResumeDto;
import com.example.resume.Dto.converter.ResumeDtoConverter;
import com.example.resume.Entity.concretes.Resume;
import com.example.resume.Exception.CustomException.ResumeCustomException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ResumeService {

    private final ResumeDao resumeDao;
    private final ResumeDtoConverter dtoConverter;


    public ResumeService(ResumeDao resumeDao, ResumeDtoConverter dtoConverter) {
        this.resumeDao = resumeDao;
        this.dtoConverter = dtoConverter;
    }


    public Resume createResume(Resume resume) {
        return resumeDao.save(resume);
    }


    public List<ResumeDto> getall( ) {
        return resumeDao.findAll()
                .stream()
                .map(dtoConverter :: convertToResume)
                .collect(Collectors.toList());
    }


    public Resume findById(int id) {
        return resumeDao.findById(id)
                .orElseThrow(
                        () -> new ResumeCustomException(" Cv Bulunamadı " + id));
    }

    public void deleteById(int id){
     resumeDao.deleteById(id);


    }


}
