package com.project.sport.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.sport.models.Role;


@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {

}