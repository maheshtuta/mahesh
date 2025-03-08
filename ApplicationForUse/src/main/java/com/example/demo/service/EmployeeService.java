package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;

@Service
public interface EmployeeService {
	public Employee saveEmployess(Employee employee);
	public Employee getEmployee(int emp_id);
	public List<Employee> getEmployess();
	public Employee updateEmployee(Employee employee ,int emp_id);
	public String deleteEmployee(int emp_id);
}
