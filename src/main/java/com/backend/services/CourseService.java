package com.backend.services;

import java.util.List;

import com.backend.entities.Course;

public interface CourseService {
	
	public List<Course> getCourses();
	
	public Course getCourse(long CourseId);
	
	public Course addCourse(Course course);
	
	public Course updateCourse(Course course);
	
	public void deleteCourse(long parselong);
	
}
