package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.Course;

public interface Repository extends JpaRepository<Course, Integer> {

}
