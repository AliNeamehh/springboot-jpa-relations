package com.example.jpaimplementation.controller;


import com.example.jpaimplementation.model.Applicant;
import com.example.jpaimplementation.model.Job;
import com.example.jpaimplementation.repository.JobRepository;
import com.example.jpaimplementation.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/jobs")
public class JobController {

    @Autowired
    private JobRepository jobRepository;

    @Autowired
    private JobService jobService;

    @PostMapping
    public ResponseEntity<Job> createJob(@RequestBody Job job) {

        return ResponseEntity.ok(jobRepository.save(job));
    }


    @PostMapping("/add-job-to-applicant")
    public ResponseEntity<Applicant> addJobToApplicant(@RequestParam Long applicantId, @RequestParam Long jonId) {

        return ResponseEntity.ok(jobService.addJobToApplicant(applicantId,jonId));
    }




}
