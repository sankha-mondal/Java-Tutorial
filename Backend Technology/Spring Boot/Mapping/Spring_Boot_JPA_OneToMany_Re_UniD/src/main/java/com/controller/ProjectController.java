package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Project;
import com.services.ProjectService;

@RestController
@RequestMapping("projects")    //  http://localhost:8383/projects/
@CrossOrigin			       //  Enable cors policies
public class ProjectController {

	@Autowired
	ProjectService projectService;
	
//====================================================================================================================================
	
		//  Retrieve Operation:-  Op:1
	
		// http://localhost:8383/projects/findAll
		@GetMapping(value = "findAll",produces = MediaType.APPLICATION_JSON_VALUE)
		public List<Project> findAll() {
			return projectService.findAllProject();
		}
		
//====================================================================================================================================

		//  Retrieve data by PK:-   Op:2
		
		//  http://localhost:8383/projects/findProjectByPK/{id}
		@GetMapping(value = "findProjectByPK/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
		public Project findProjectByPK(@PathVariable("id") int id) {
			return projectService.findProjectByPK(id);
		}
		
//====================================================================================================================================

		//  Insert Operation | By PK | By unique Id:-    Op:3
	
		//  http://localhost:8383/projects/create
		@PostMapping(value = "create",consumes = MediaType.APPLICATION_JSON_VALUE)
		public String createProject(@RequestBody Project project) {
			return projectService.createProject(project);
		}		

//====================================================================================================================================

		//  Update Operation:-   Op:4
		
		//  http://localhost:8383/projects/updateProject
		@PutMapping(value = "updateProject",consumes = MediaType.APPLICATION_JSON_VALUE)
		public String updateProject(@RequestBody Project project) {
			return projectService.updateProject(project);
		}

//====================================================================================================================================
		
		//  Delete Operation:-   Op:5
		
		//  http://localhost:8383/projects/deleteProject/{id}
		@DeleteMapping(value = "deleteProject/{id}")
		public String deleteProject(@PathVariable("id") int id) {
			return projectService.deleteProject(id);
		}
				
				
				
				
				
}
