package com.example.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.application.ProjectServiceApplication;
import com.example.entity.Project;
import com.example.repository.ProjectRepository;
import com.example.service.ProjectService;

@Service
public class ProjectServiceImpl implements ProjectService{
	
	@Autowired
	private ProjectRepository projectrepo;

	@Override
	public Project saveproject(Project project) {
		Project saveProject = projectrepo.save(project);
		return saveProject;
	}

	@Override
	public Project getProjectByCode(long projectCode) {
		Project code = projectrepo.findByProjectCode(projectCode);
		return code;
	}

}
