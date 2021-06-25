package com.example.resume.Business.abstracts;

import com.example.resume.Entity.concretes.Resume;

import java.util.List;

public interface ResumeService {
    Resume add (Resume resume);
    List<Resume>getall();
}
