package com.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entity.Project;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Integer>{

}
