package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Assigenment;

public interface AssigenmentRepo extends JpaRepository<Assigenment	, Integer> {
}
