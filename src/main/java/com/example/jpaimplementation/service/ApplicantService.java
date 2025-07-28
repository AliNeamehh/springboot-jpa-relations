package com.example.jpaimplementation.service;


import com.example.jpaimplementation.model.Applicant;
import com.example.jpaimplementation.model.Application;
import com.example.jpaimplementation.model.Resume;
import com.example.jpaimplementation.repository.ApplicantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApplicantService {

    @Autowired
    private ApplicantRepository applicantRepository;


    public Applicant addApplicant(Applicant applicant) {
        Resume resume = applicant.getResume();

        List<Application> applications = applicant.getApplications();

        if (applications != null && !applications.isEmpty()) {
            applications.forEach(application -> {
                application.setApplicant(applicant);
            });
        }

        if (resume != null) {
            resume.setApplicant(applicant);
        }
        return applicantRepository.save(applicant);
    }
}
