 package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.repo.StudentRepo;

@RestController
public class StudentController {
	Logger logger = LoggerFactory.getLogger(StudentController.class);
	
	
	
	@Autowired
	StudentRepo studentRepo;
	
	@PostMapping("/api/students")
	public ResponseEntity<Student>saveStudent(@RequestBody Student student) {
		logger.trace("get all students methods with trace log level");
		logger.info("get all students methods with info log level");
		logger.error("get all students methods with error log level");
		return new ResponseEntity<>(studentRepo.save(student),HttpStatus.CREATED);
		
		
	}
	@GetMapping("api/students")
	public ResponseEntity <List<Student>>getStudents() {
		return new ResponseEntity<> (studentRepo.findAll(),HttpStatus.OK);
		
	}
	@GetMapping("api/students/{id}")
	public ResponseEntity<Student>getStudent(@PathVariable long id){
		Optional<Student>student=studentRepo.findById(id);
		if(student.isPresent()) {
			return new ResponseEntity<>(student.get(),HttpStatus.OK);
		}
		else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);	
		}
		
	}
	@PutMapping("api/students/{id}")
	public ResponseEntity<Student> updateStudent(@PathVariable long id, @RequestBody Student stud){
		Optional<Student>student=studentRepo.findById(id);
		if(student.isPresent()) {
			student.get().setStudentName(stud.getStudentName());
			student.get().setStudentEmail(stud.getStudentEmail());
			student.get().setStudentAddress(stud.getStudentAddress());
			return new ResponseEntity<>(studentRepo.save(student.get()),HttpStatus.OK);
		}
		else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		
	} 
	  

}
