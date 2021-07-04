package com.example.resume.DataAcces;

import com.example.resume.Entity.concretes.Skill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SkillDao extends JpaRepository<Skill , Integer> {
}
