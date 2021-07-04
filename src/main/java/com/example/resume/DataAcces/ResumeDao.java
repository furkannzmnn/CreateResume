package com.example.resume.DataAcces;
import com.example.resume.Entity.concretes.Resume;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ResumeDao extends JpaRepository<Resume, Integer> {

   //Resume findById(String  id);


}
