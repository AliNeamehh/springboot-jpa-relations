package com.example.jpaimplementation.repository;

import com.example.jpaimplementation.model.Applicant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicantRepository extends JpaRepository<Applicant, Long> {

}
