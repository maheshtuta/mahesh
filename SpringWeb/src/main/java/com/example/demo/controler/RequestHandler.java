package com.example.demo.controler;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.jpa.Repository;
import com.example.demo.model.Student;

import Service.StudentService;

@RestController

public class RequestHandler {
	@Autowired
	private StudentService sd;


	@GetMapping("/students/")
	public List<Student> getAllStudents() {
		List<Student> student = sd.getAllStudents();
		return student;
	
		
	}
//	@GetMapping("/student/{id}")
//	public Student getStudent(@PathVariable int id) {
//	Student student=	repo.findById(id).get();
//		
//		return student;
//		
//	}
//	
//	@PostMapping("student/add")
//	@ResponseStatus(code = HttpStatus.CREATED) 
//	public void createStudent(@RequestBody Student student) {
//		repo.save(student);	
//		
//	}
//	@PutMapping("/student/update/{id}")
//	public Student updateStuedent(@PathVariable int id) {
//		Student student = repo.findById(id).get();
//		student.setPercentage(90);
//		student.setStudentName("prathyu");
//		student.setPhone("8973973748");
//		repo.save(student);
//		return student;
//	
//	}
//	@DeleteMapping("/student/delete/{id}")
//	public void removeStudent(@PathVariable int id) {
//		Student student = repo.findById(id).get();
//		repo.delete(student);
//	
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
