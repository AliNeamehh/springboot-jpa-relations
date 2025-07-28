package com.example.jpaimplementation.controller;

import com.example.jpaimplementation.model.Resume;
import com.example.jpaimplementation.service.ResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/resumes")
public class ResumeController {

    @Autowired
    private ResumeService resumeService;

    @PostMapping("/{applicantId}")
    public ResponseEntity<Resume> createResume(@PathVariable Long applicantId, @RequestBody Resume resume) {

        resumeService.addResume(applicantId, resume);
        return ResponseEntity.ok(resume);

    }


}
