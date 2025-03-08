package com.example.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Employee;
import com.example.entity.Project;
import com.example.payload.EmployeeDto;
import com.example.repository.EmployeeRepository;
import com.example.repository.ProjectRepository;
import com.example.service.EmployeeService;


@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepository employeerepo;
	
	@Autowired
	private ProjectRepository projectrepo;
	

	@Override
	public EmployeeDto saveEmployee(Employee employee) {
		Employee EmpObject = employeerepo.save(employee);
		Project project = projectrepo.findByProjectCode(EmpObject.getEmployeeAssignedProject());
	}

	@Override
	public EmployeeDto getEmployee(long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
