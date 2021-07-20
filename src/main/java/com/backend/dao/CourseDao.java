package com.backend.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.backend.entities.Course;

public interface CourseDao extends JpaRepository<Course, Long>{

}
