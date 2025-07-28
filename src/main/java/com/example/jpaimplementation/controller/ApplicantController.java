package com.example.jpaimplementation.controller;


import com.example.jpaimplementation.model.Applicant;
import com.example.jpaimplementation.service.ApplicantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/applicants")
public class ApplicantController {

    @Autowired
    private ApplicantService  applicantService;

    @PostMapping
    public ResponseEntity<Applicant> addApplicant(@RequestBody Applicant applicant){
        Applicant applicant1=  applicantService.addApplicant(applicant);
        return ResponseEntity.ok(applicant1);
    }

}
