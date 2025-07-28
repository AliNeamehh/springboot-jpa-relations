package com.example.jpaimplementation.service;


import com.example.jpaimplementation.model.Applicant;
import com.example.jpaimplementation.model.Resume;
import com.example.jpaimplementation.repository.ApplicantRepository;
import com.example.jpaimplementation.repository.ResumeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ResumeService {

    @Autowired
    private ResumeRepository resumeRepository;
    @Autowired
    private ApplicantRepository applicantRepository;

    public Resume addResume(Long applicantId, Resume resume) {


        Optional<Applicant> optionalApplicant = applicantRepository.findById(applicantId);

        if (optionalApplicant.isPresent()) {

            Applicant applicant = optionalApplicant.get();
            resume.setApplicant(applicant);
            return resumeRepository.save(resume);


        } else {
            throw new RuntimeException("Applicant not found");

        }


    }

}
