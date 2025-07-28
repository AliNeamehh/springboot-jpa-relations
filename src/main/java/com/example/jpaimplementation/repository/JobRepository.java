package com.example.jpaimplementation.repository;

import com.example.jpaimplementation.model.Job;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobRepository extends JpaRepository<Job, Long> {

}
