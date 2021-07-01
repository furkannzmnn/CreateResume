package com.example.resume.api.controller;


import com.example.resume.Business.abstracts.EducationService;
import com.example.resume.Entity.Dto.EducationDto;
import com.example.resume.Entity.concretes.Education;

import org.springframework.core.io.InputStreamResource;
import org.springframework.http.MediaType;
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
    public ResponseEntity<?> Add(@Valid @RequestBody Education education){
        return ResponseEntity.ok(this.educationService.Add(education));
    }


    @GetMapping(value = "educationGetall" )
    public ResponseEntity<List<EducationDto>> getall(){

        return ResponseEntity.ok(this.educationService.getall());

    }


}
