package com.example.service;

import java.util.List;

import com.example.model.Course;

public interface CourseService {
	public String upsert(Course c);
	public Course getById(int id);
	public List<Course> getCourses();
	public String DeleteById(int id);
	
	

}
