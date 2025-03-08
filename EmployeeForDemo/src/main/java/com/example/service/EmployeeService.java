package com.example.service;

import java.util.List;

import com.example.entity.Employee;

public interface EmployeeService {
	
	public Employee saveEmployee(Employee employee);
	public List<Employee> getEmployee();
	public Employee updateEmployee(int id, Employee employee);
	public String deleteEmployee(int id);
	
	

}
