package com.example.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.Admin;

public interface AdminDao extends JpaRepository<Admin, Integer> {
	Optional<Admin> findByUsername(String username);
}
