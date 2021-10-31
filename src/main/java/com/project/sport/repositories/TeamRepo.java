package com.project.sport.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.sport.models.Team;

public interface TeamRepo extends JpaRepository<Team, Long> {

}
