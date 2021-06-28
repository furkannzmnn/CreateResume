package com.example.resume.api.controller;

import com.example.resume.Business.abstracts.ResumeService;
import com.example.resume.Entity.Dto.ResumeDto;
import com.example.resume.Entity.concretes.Resume;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/resume/")
public class ResumeController {

    private final ResumeService resumeService;

    public ResumeController(ResumeService resumeService) {
        this.resumeService = resumeService;
    }

    @PostMapping("addresume")
    public ResponseEntity add( @RequestBody Resume resume){
        this.resumeService.add(resume);
                return ResponseEntity.ok(HttpStatus.OK);
    }

    @GetMapping("getresume")
    public List<ResumeDto> getall( ){
        return  this.resumeService.getall();
    }

}
