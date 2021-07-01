package com.example.resume.DataAcces;
import com.example.resume.Entity.Dto.ResumeDto;
import com.example.resume.Entity.concretes.Resume;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ResumeDao extends JpaRepository<Resume, Integer> {

    // Resume Dto Convert
    //@Query("select  new com.example.resume.Entity.Dto.ResumeDto (a.experienceName,e.schoolName,e.firstYear,e.endYear,a.experienceDescription) " +
      //      "from Resume j inner join j.education e inner join j.experience a")
   // List<ResumeDto> getResumeDto();


}
