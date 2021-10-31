package com.project.sport.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.sport.models.Matche;

public interface MatchRepo extends JpaRepository<Matche, Long> {

}
