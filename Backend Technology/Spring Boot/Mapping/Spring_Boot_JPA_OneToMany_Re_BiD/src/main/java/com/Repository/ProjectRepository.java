package com.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entity.Project;

public interface ProjectRepository extends JpaRepository<Project, Integer>{

}
