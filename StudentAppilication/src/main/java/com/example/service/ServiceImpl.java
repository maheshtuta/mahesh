package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.Repository;
import com.example.model.Course;

@Service

public class ServiceImpl implements CourseService {
	@Autowired
	Repository  repo;

	@Override
	public String upsert(Course c) {
		repo.save(c);
		
		return "sucess";
	}

	@Override
	public Course getById(int id) {
//		Course cs = repo.findById(id).get();
//		return cs;
		
		Optional<Course>cid = repo.findById(id);
		if(cid.isPresent()) {
			return cid.get();
		}
		else {
			return null;
		}
	}

	@Override
	public List<Course> getCourses() {
		List<Course> list = repo.findAll();
		return list;
	}

	@Override
	public String DeleteById(int id) {
		if(repo.existsById(id)) {
			repo.deleteById(id);
			return "deleted";
		}
			
		else {
			return "no records";
		}
		
	}
	
	

}
