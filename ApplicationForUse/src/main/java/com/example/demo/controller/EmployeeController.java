package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;
//import com.example.demo.service.EmployeeService;


@RestController
public class EmployeeController {
	
	@Autowired
	public EmployeeService employeeservice;
	
	@PostMapping("/api/employee")
	public ResponseEntity<Employee> addEmployees(@RequestBody Employee employee){
		return new ResponseEntity<>(employeeservice.saveEmployess(employee),HttpStatus.CREATED);
		
	}
	
	@GetMapping("/api/employees")
	public ResponseEntity<List<Employee>> getAllEmployees(){
		return new ResponseEntity<>(employeeservice.getEmployess(),HttpStatus.OK);
	}

}
