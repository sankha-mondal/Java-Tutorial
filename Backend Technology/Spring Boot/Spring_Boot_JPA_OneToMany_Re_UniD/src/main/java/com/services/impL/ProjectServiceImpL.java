package com.services.impL;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Repository.ProjectRepository;
import com.entity.Project;
import com.services.ProjectService;

@Service
public class ProjectServiceImpL implements ProjectService {

		@Autowired
		ProjectRepository projectRepository;
	
//======================================================================================================================================
	
		//  Retrieve Operation:-  Op:1
		
		@Override
		public List<Project> findAllProject() {	
			return projectRepository.findAll();
		}
	
//======================================================================================================================================

	
		//  Retrieve data by PK:-   Op:2
		
		@Override
		public Project findProjectByPK(Integer id) {
			Optional<Project> op = projectRepository.findById(id);
			if(op.isPresent()) {
				Project p = op.get();
					return p;
			} else {
				return null;
			}	
		}
	
//======================================================================================================================================
	
		//  Insert Operation | By PK:-    Op:3
		
		@Override
		public String createProject(Project project) {
			boolean res = projectRepository.existsById(project.getId());
			if(res) {
				return "Project details didn't Stored...";
			} else {
				projectRepository.save(project);
				return "Project details Stored successfully...";
			}
		}
	
//======================================================================================================================================

		//  Update Operation:-    Op:4
		
		@Override
		public String updateProject(Project project) {
			Optional<Project> op =  projectRepository.findById(project.getId());
			if(op.isPresent()) {
				Project p = op.get();
				p.setProjectName(project.getProjectName());
				projectRepository.saveAndFlush(p);
				return "Project details updated successfully...";
			} else {
				return "Project not present...";
			}
	}
	
//======================================================================================================================================

		//  Delete Operation:-    Op:5
		
		@Override
		public String deleteProject(Integer id) {
			Optional<Project> op = projectRepository.findById(id);
			if(op.isPresent()) {
				Project p = op.get();
				projectRepository.delete(p);
				return "Product details deleted successfully...";
			} else {
				return "Product not present...";
			}	
			
		}
		
}
