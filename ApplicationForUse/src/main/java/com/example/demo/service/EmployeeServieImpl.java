package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entity.Employee;
import com.example.demo.repo.EmployeeRepo;

public class EmployeeServieImpl implements EmployeeService{
	
	@Autowired
	public EmployeeRepo employeeRepo;

	@Override
	public Employee saveEmployess(Employee employee) {
		Employee emp = employeeRepo.save(employee);
		return emp;
	}

	@Override
	public Employee getEmployee(int emp_id) {
		Optional<Employee> emp = employeeRepo.findById(emp_id);
		return emp.get();
	}

	@Override
	public List<Employee> getEmployess() {
		List<Employee> employee = employeeRepo.findAll();
		return employee;
	}

	@Override
	public Employee updateEmployee(Employee employee, int emp_id) {
		Optional<Employee> emp = employeeRepo.findById(emp_id);
		if(emp.isPresent())
		{
			emp.get().setEmpName(employee.getEmpName());
			emp.get().setSalary(employee.getSalary());
			emp.get().setPhNumber(employee.getPhNumber());
			return employeeRepo.save(emp.get());
		}
		else
		{
		return null;
		}
	}

	@Override
	public String deleteEmployee(int emp_id) {
		if(employeeRepo.existsById(emp_id))
		{
			employeeRepo.deleteById(emp_id);;
			return "deleted";
		}
		else
		{
			return "no records";
		}
	}

}
