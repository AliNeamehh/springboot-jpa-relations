package com.example.jpaimplementation.service;

import com.example.jpaimplementation.model.Applicant;
import com.example.jpaimplementation.model.Job;
import com.example.jpaimplementation.repository.ApplicantRepository;
import com.example.jpaimplementation.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class JobService {

    @Autowired
    private JobRepository jobRepository;

    @Autowired
    private ApplicantRepository applicantRepository;


    public Job createJob(Job job) {
        return jobRepository.save(job);
    }

    public Applicant addJobToApplicant(Long ApplicantId, Long jobId) {
        Optional<Applicant> applicant = applicantRepository.findById(ApplicantId);
        Optional<Job> job = jobRepository.findById(jobId);

        if (applicant.isPresent() && job.isPresent()) {
            applicant.get().getJobs().add(job.get());
            applicantRepository.save(applicant.get());
            return applicant.get();
        } else {
            throw new RuntimeException("Applicant or Job not found");
        }
    }

}
