package com.example.resume.api.controller;

import com.example.resume.Business.concretes.SkillService;
import com.example.resume.Dto.SkillDto;
import com.example.resume.Entity.concretes.Skill;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/skils/")
public class SkillController {

    private final SkillService skillService;


    public SkillController(SkillService skillService) {
        this.skillService = skillService;
    }

    @GetMapping("skillget")
    public ResponseEntity<List<SkillDto>> getall() {
        return ResponseEntity.ok(this.skillService.getall());
    }

    @PostMapping("skiladd")
    public ResponseEntity<?> add(@RequestBody Skill skill) {
        return ResponseEntity.ok(this.skillService.add(skill));
    }
}
