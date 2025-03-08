package com.example.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.entity.Project;

@FeignClient(url="http://localhost:8081",value= "project-feign-client", path="/api/project")
public interface ProjectFeign {
	
	@GetMapping("/{projectCode}")
	feign.Response getProjectByCode(@PathVariable long projectCode);
		

}
