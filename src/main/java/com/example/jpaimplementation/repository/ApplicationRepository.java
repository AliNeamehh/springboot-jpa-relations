package com.example.jpaimplementation.repository;

import com.example.jpaimplementation.model.Application;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicationRepository extends JpaRepository<Application, Long> {
}
