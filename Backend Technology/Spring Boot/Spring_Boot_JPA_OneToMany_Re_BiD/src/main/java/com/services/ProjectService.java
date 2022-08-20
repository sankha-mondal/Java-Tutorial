package com.services;

import java.util.List;

import com.entity.Project;

public interface ProjectService {
	
	//  Retrieve Operation:-  Op:1
	List<Project> findAllProject();
	
	//  Retrieve data by PK:-   Op:2
	Project findProjectByPK(Integer id);
	
	//  Insert Operation | By PK:-    Op:3
	String createProject(Project project);
	
	//  Update Operation:-    Op:4
	String updateProject(Project project);
	
	//  Delete Operation:-    Op:5
	String deleteProject(Integer id);

}
