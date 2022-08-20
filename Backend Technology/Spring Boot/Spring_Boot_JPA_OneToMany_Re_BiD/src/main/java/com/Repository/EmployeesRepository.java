package com.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entity.Employees;
import com.entity.Project;

public interface EmployeesRepository extends JpaRepository<Employees, Integer> {
	
	List<Employees> findByProject(Project project);

}
