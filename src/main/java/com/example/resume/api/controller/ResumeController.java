package com.example.resume.api.controller;

import com.example.resume.Business.ResumeService;
import com.example.resume.Dto.Requests.ResumeRequest;
import com.example.resume.Dto.ResumeDto;
import com.example.resume.Entity.Resume;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/resume/")
@CrossOrigin
public class ResumeController {

    private final ResumeService resumeService;

    public ResumeController(ResumeService resumeService) {
        this.resumeService = resumeService;
    }

    @PostMapping("addresume")
    public ResponseEntity<ResumeDto> createResume( @RequestBody ResumeRequest resumeRequest){
        return ResponseEntity.ok(
                this.resumeService.createResume(resumeRequest));
    }

    @GetMapping("getresume" )
    public ResponseEntity<List<ResumeDto>> getall(){
        return ResponseEntity.ok(this.resumeService.getall());
    }







}
