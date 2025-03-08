package com.example.service;

import com.example.entity.Project;

public interface ProjectService {
	public Project saveproject(Project project);
	public 	Project getProjectByCode(long projectCode);
	

}
