package com.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entity.Employees;
import com.entity.Project;

@Repository
public interface EmployeesRepository extends JpaRepository<Employees, Integer> {
	

}
