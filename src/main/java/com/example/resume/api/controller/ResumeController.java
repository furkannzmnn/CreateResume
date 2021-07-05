package com.example.resume.api.controller;

import com.example.resume.Business.ResumeService;
import com.example.resume.Dto.ResumeDto;
import com.example.resume.Entity.Resume;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/resume/")
public class ResumeController {

    private final ResumeService resumeService;

    public ResumeController(ResumeService resumeService) {
        this.resumeService = resumeService;
    }

    @PostMapping("addresume")
    public ResponseEntity<?> createResume( @RequestBody Resume resume){
        this.resumeService.createResume(resume);
                return ResponseEntity.ok(HttpStatus.OK);
    }

    @GetMapping("getresume")
    public ResponseEntity<List<ResumeDto>> getall(){
        return ResponseEntity.ok(this.resumeService.getall());
    }

    @PostMapping("findId")
    public ResponseEntity<?> ResumefindById( @RequestParam int id){
        return ResponseEntity.ok(this.resumeService.findById(id));
    }

    @DeleteMapping("delete/{id}")
    public void deleteById(@PathVariable int id){
        this.resumeService.deleteById(id);
    }




}
