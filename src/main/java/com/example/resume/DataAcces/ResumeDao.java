package com.example.resume.DataAcces;
import com.example.resume.Entity.Resume;
import com.sun.xml.bind.v2.model.core.ID;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ResumeDao extends JpaRepository<Resume, Integer> {


}
