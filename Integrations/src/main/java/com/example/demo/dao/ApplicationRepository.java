package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Application;

public interface ApplicationRepository extends JpaRepository<Application, Long> {

	List<Application> findByappName(String name);
}
