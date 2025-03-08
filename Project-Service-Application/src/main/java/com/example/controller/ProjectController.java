package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Project;
import com.example.service.ProjectService;

@RestController
@RequestMapping("/api/project")
public class ProjectController {
	
	@Autowired
	private ProjectService projectrepo;
	
	@PostMapping
	public Project crateProject(@RequestBody Project project) {
		 Project obj =  projectrepo.saveproject(project);
		return obj;
		
	}
	
	@GetMapping("/{projectCode}")
	public Project getById(@PathVariable long projectCode) {
		Project pdb = projectrepo.getProjectByCode(projectCode);
		
		return pdb;
	}

}
