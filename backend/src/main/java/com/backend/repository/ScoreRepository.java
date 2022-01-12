package com.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.backend.entities.Score;
import com.backend.entities.ScorePK;


public interface ScoreRepository extends JpaRepository<Score, ScorePK>{

}
