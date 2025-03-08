package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity

//@Table(name="student")
public class Student {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	
	int id;
	//@Column(name="studentName")
	String studentName;
	float percentage;
	String phone;
	public Student(String studentName, float percentage, String phone) {
		super();
		this.studentName = studentName;
		this.percentage = percentage;
		this.phone = phone;
	}
	public Student() {
		
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public float getPercentage() {
		return percentage;
	}
	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", id=" + id + ", percentage=" + percentage + ", phone=" + phone
				+ "]";
	}
	
	
	

}
