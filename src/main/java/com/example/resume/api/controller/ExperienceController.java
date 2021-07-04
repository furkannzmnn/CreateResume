package com.example.resume.api.controller;


import com.example.resume.Business.concretes.ExperienceService;
import com.example.resume.Dto.ExperienceDto;
import com.example.resume.Entity.concretes.Experience;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/experience/")
public class ExperienceController {
    private final ExperienceService experienceService;

    public ExperienceController(ExperienceService experienceService) {
        this.experienceService = experienceService;
    }

    @GetMapping("getall")
    public ResponseEntity<List<ExperienceDto>> getall(){
       return ResponseEntity.ok(this.experienceService.getall());
    }

    @PostMapping("addexperience")
    public Experience add( @RequestBody Experience experience){
        return this.experienceService.add(experience);
    }
}
