package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Course;
import com.example.service.CourseService;

@RestController
public class Controller {
	@Autowired
	CourseService service;
	@PutMapping("/course/")
	public ResponseEntity<String> createCourse(@RequestBody Course c){
		String status = service.upsert(c);
		return new ResponseEntity<>(status, HttpStatus.OK);
		
	}
	
	@GetMapping("/course/{id}")
	public ResponseEntity<Course> getcourse(@PathVariable int id) {
		Course course = service.getById(id);
		return new ResponseEntity<>(course, HttpStatus.OK);
		
	}
	@GetMapping("/courses/")
	public ResponseEntity<List<Course>> getAllCourses(){
		List<Course> course = service.getCourses();
		return new ResponseEntity<>(course, HttpStatus.OK);
		
		
	}
	@DeleteMapping("/course/{id}")
	public ResponseEntity<String>deleteCourse(@PathVariable int id){
		String str = service.DeleteById(id);
		return new ResponseEntity<>(str, HttpStatus.OK);
		
	}
	

}
