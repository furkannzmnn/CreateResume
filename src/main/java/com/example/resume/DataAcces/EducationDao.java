package com.example.resume.DataAcces;

import com.example.resume.Entity.concretes.Education;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EducationDao extends JpaRepository<Education  , Integer> {
}
