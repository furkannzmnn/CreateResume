package com.example.resume.Business.concretes;

import com.example.resume.Business.abstracts.ResumeService;
import com.example.resume.DataAcces.ResumeDao;
import com.example.resume.Entity.concretes.Resume;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResumeManager implements ResumeService {

    private final ResumeDao resumeDao;


    public ResumeManager(ResumeDao resumeDao) {
        this.resumeDao = resumeDao;

    }

    @Override
    public Resume add(Resume resume) {
        return resumeDao.save(resume);
    }

    @Override
    public List<Resume> getall( ) {
        return resumeDao.findAll();
    }


}
