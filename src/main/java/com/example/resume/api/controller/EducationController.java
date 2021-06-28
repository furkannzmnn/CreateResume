package com.example.resume.api.controller;


import com.example.resume.Business.abstracts.EducationService;
import com.example.resume.Entity.concretes.Education;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/education/")
public class EducationController {
    private final EducationService educationService;

    public EducationController(EducationService educationService) {
        this.educationService = educationService;
    }


    @PostMapping(value = "educationadd")
    public ResponseEntity<?> add(@Valid @RequestBody Education education){
        return ResponseEntity.ok(this.educationService.add(education));
    }

    @GetMapping("educationGetall")
    public List<Education> getall(){
        return this.educationService.getall();
    }
}
