package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Employee;
import com.example.service.EmployeeServiceImpl;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeServiceImpl service;
	
	@PostMapping("/saveEmployees")
	public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee)
	{
		return new ResponseEntity<>(service.saveEmployee(employee),HttpStatus.CREATED);
	}
	
	@GetMapping("/listEmployees")
	public ResponseEntity<List<Employee>> fetchEmployess()
	{
		
		return new ResponseEntity<>(service.getEmployee(),HttpStatus.OK );
	}
	
	@PutMapping("/updateEmployee/{id}")
	public ResponseEntity<Employee> editEmployee(int id, Employee emp)
	{
		return new ResponseEntity<>(service.updateEmployee(id, emp),HttpStatus.OK);
	}
	
	@DeleteMapping("/deleteEmployee/{id}")
	public ResponseEntity<String> removeEmployee(int id)
	{
		return new ResponseEntity<>(service.deleteEmployee(id),HttpStatus.OK);
	}
	

}
