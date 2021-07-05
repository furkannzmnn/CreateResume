package com.example.resume.DataAcces;

import com.example.resume.Entity.Education;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EducationDao extends JpaRepository<Education  , Integer> {
}
