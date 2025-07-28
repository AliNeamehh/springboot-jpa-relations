package com.example.jpaimplementation.controller;


import com.example.jpaimplementation.model.Application;
import com.example.jpaimplementation.service.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/applications")
public class ApplicationController {

    @Autowired
    private ApplicationService applicationService;


    @PostMapping("/{ApplicantId}")
    public ResponseEntity<Application> createApplication(@PathVariable Long ApplicantId ,@RequestBody Application application) {

        return   ResponseEntity.ok().body(applicationService.createApplication(ApplicantId,application));

    }


}
