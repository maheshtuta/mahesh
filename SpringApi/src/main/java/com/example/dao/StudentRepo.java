package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.Student;

public interface StudentRepo extends JpaRepository<Student, Long> {

}
