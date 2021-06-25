package com.example.resume.api.controller;


import com.example.resume.Business.abstracts.ExperienceService;
import com.example.resume.Entity.concretes.Experience;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/experience/")
public class ExperienceController {
    private final ExperienceService experienceService;

    public ExperienceController(ExperienceService experienceService) {
        this.experienceService = experienceService;
    }

    @GetMapping("getall")
    public List<Experience> getall(){
       return this.experienceService.getall();
    }

    @PostMapping("addexperience")
    public Experience add( @RequestBody Experience experience){
        return this.experienceService.add(experience);
    }
}
