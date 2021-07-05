package com.example.resume.DataAcces;

import com.example.resume.Entity.Experience;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ExperienceDao extends JpaRepository<Experience , Integer> {
}
