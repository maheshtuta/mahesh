package com.example.service;

import com.example.entity.Employee;
import com.example.payload.EmployeeDto;

public interface EmployeeService {
	public EmployeeDto saveEmployee(Employee employee);
	public EmployeeDto getEmployee(long id);

}
