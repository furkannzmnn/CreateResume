package com.example.resume.Business.concretes;

import com.example.resume.Business.abstracts.ResumeService;
import com.example.resume.DataAcces.ResumeDao;
import com.example.resume.Entity.Dto.ResumeDto;
import com.example.resume.Entity.Dto.converter.ResumeDtoConverter;
import com.example.resume.Entity.concretes.Resume;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ResumeManager implements ResumeService {

    private final ResumeDao resumeDao;
    private final ResumeDtoConverter dtoConverter;


    public ResumeManager(ResumeDao resumeDao, ResumeDtoConverter dtoConverter) {
        this.resumeDao = resumeDao;

        this.dtoConverter = dtoConverter;
    }

    @Override
    public Resume add(Resume resume) {
        return resumeDao.save(resume);
    }

    @Override
    public List<ResumeDto> getall( ) {
        return resumeDao.findAll()
                .stream()
                .map(dtoConverter :: convertToResume)
                .collect(Collectors.toList());
    }


}
