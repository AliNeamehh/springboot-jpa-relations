package com.example.jpaimplementation.service;


import com.example.jpaimplementation.model.Applicant;
import com.example.jpaimplementation.model.Application;
import com.example.jpaimplementation.repository.ApplicantRepository;
import com.example.jpaimplementation.repository.ApplicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ApplicationService {

    @Autowired
    private ApplicationRepository applicationRepository;

    @Autowired
    private ApplicantRepository applicantRepository;

    public Application createApplication(Long ApplicantId, Application application) {

        Optional<Applicant> optionalApplicant = applicantRepository.findById(ApplicantId);

        if (optionalApplicant.isPresent()) {

            Applicant applicant = optionalApplicant.get();

            application.setApplicant(applicant);

            return applicationRepository.save(application);


        } else {

            throw new RuntimeException("Applicant not found");

        }


    }


}
