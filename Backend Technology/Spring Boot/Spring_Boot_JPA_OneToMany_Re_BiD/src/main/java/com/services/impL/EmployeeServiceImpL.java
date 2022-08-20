package com.services.impL;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Repository.EmployeesRepository;
import com.Repository.ProjectRepository;
import com.entity.Employees;
import com.entity.Project;
import com.services.EmployeeService;

@Service
public class EmployeeServiceImpL implements EmployeeService {
	
	@Autowired
	private EmployeesRepository empRepo;
	
	@Autowired
	private ProjectRepository proRepo;
	
//=========================================================================================================================

	@Override
	public List<Employees> findAllEmployees() {
		
		return null;
	}

	@Override
	public Employees findEmployeesByPK(Integer id) {
		
		return null;
	}

	@Override
	public List<Employees> findAllEmployeesByProject(Integer projectId) {
		// TODO Auto-generated method stub
		return null;
	}
	
//=========================================================================================================================
	
	//  Insert Operation :-    Op:4

	@Override
	public String createEmployees(Employees employee, Integer projectId) {
		
		Optional<Project> op = proRepo.findById(projectId);     	// true
		boolean resEmp = empRepo.existsById(employee.getId());		// false 

		
		if(resEmp && op.isPresent()) {     //  && op.isPresent()
			return "Employee details didn't Store...";
		} 
		else if(op.isPresent() == false) {
			return "Project or Project Id is not present...";
		}
		else {
			employee.setProject(op.get());
			empRepo.save(employee);
			return "Employee details Stored successfully...\nAllotted Project ID: "+projectId;
		}
	}
	
//=========================================================================================================================

	@Override
	public String updateEmployees(Employees employees) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteEmployees(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employees> searchEmployee(String keyword) {
		// TODO Auto-generated method stub
		return null;
	}

}
