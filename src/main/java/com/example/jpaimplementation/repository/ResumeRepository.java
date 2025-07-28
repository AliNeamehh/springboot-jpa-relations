package com.example.jpaimplementation.repository;

import com.example.jpaimplementation.model.Applicant;
import com.example.jpaimplementation.model.Resume;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResumeRepository extends JpaRepository<Resume, Long> {
}
