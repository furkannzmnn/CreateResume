package com.example.resume.api.controller;


import com.example.resume.Business.EducationService;
import com.example.resume.Dto.EducationDto;
import com.example.resume.Dto.Requests.EducationRequest;
import com.example.resume.Entity.Education;

import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.List;


@RestController
@RequestMapping("/api/education/")
@CrossOrigin
public class EducationController {

    private final EducationService educationService;

    public EducationController(EducationService educationService) {
        this.educationService = educationService;
    }


    @PostMapping(value = "educationadd")
    public ResponseEntity<?> Add(@Valid @RequestBody EducationRequest request){
        return ResponseEntity.ok(this.educationService.Add(request));
    }


   @GetMapping(value = "educationGetall")
    public ResponseEntity<List<EducationDto>> getall(){

        return ResponseEntity.ok(this.educationService.getall());

    }


}
