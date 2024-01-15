package com.example.demo.Service;

import java.util.List;

import com.example.demo.Entity.Course;

public interface CourseService {
                                          	// list of abstract methods
	public Course addCourse(Course c);
	public List<Course> getAllCourses();
	public Course getCourseById(int cid);
	public String deleteCourse(int cid);
	public  Course updateCourse(Course c);

}
