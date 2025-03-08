package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Employee;
import com.example.repo.EmployeeRepo;
@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	EmployeeRepo repo;

	@Override
	public Employee saveEmployee(Employee employee) {
		Employee emp=repo.save(employee);
		return emp;
	}

	@Override
	public List<Employee> getEmployee() {
		List<Employee> emp= repo.findAll();
		return emp;
	}

	@Override
	public Employee updateEmployee(int id, Employee employee) {
		Optional<Employee> emp = repo.findById(id);
		if(emp.isPresent())
		{
			emp.get().setName(employee.getName());
			emp.get().setEmail(employee.getEmail());
			emp.get().setNumber(employee.getNumber());
			return employee;
		}
		else
		{
			return emp.get();
		}
	}

	@Override
	public String deleteEmployee(int id) {
		if(repo.existsById(id))
		{
			repo.deleteById(id);
			return "deleted";
		}
		else
		return "no records found";	
	
	}

	

}
