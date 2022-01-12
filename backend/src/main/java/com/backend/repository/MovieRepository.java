package com.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.backend.entities.Movie;


public interface MovieRepository extends JpaRepository<Movie, Long>{

}
