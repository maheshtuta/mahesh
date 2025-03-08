package com.example.demo.entity;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="employee_table")
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
public class Employee {
	
	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="emp_id")
	public int id;
	@Column(name="employee_name")
	public String empName;
	@Column(name="emp_salary")
	public double salary;
	@Column(name="emp_phnumber")
	public String phNumber;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getPhNumber() {
		return phNumber;
	}
	public void setPhNumber(String phNumber) {
		this.phNumber = phNumber;
	}
	public Employee(int id, String empName, double salary, String phNumber) {
		super();
		this.id = id;
		this.empName = empName;
		this.salary = salary;
		this.phNumber = phNumber;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", empName=" + empName + ", salary=" + salary + ", phNumber=" + phNumber + "]";
	}
	

}
