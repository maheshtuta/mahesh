package com.example.demo.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Student;

public interface Repository extends JpaRepository<Student, Integer>{

}
