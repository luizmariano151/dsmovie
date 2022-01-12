package com.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.backend.entities.User;


public interface UserRepository extends JpaRepository<User, Long>{
	
	User findByEmail(String email);
}
