package com.example.demo.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Course;
import com.example.demo.Entity.Student;
import com.example.demo.Repository.CourseRepository;
import com.example.demo.Repository.StudentRepository;
import com.example.demo.Service.CourseService;

@Service
public class CourseServiceImpl implements CourseService {

	
	@Autowired
	CourseRepository courseRepository;
	@Autowired
	StudentRepository studentRepository;
	
                                                  	// override the all Course abstract methods
	
	@Override
	public Course addCourse(Course c) {
		// TODO Auto-generated method stub
		Student stu=studentRepository.findById(c.getStudentid()).get();
		c.setStud(stu);
		
		return courseRepository.save(c);
	}

	@Override
	public List<Course> getAllCourses() {
		// TODO Auto-generated method stub
		return courseRepository.findAll();
	}

	@Override
	public Course getCourseById(int cid) {
		// TODO Auto-generated method stub
		return courseRepository.findById(cid).get();
	}

	@Override
	public String deleteCourse(int cid) {
		// TODO Auto-generated method stub
		courseRepository.deleteById(cid);
		return "Course Deleted...";
	}

	@Override
	public Course updateCourse(Course c) {
		// TODO Auto-generated method stub
		Course c1=courseRepository.findById(c.getCid()).get();
		c1.setName(c.getName());
		c1.setCredit(c.getCredit());
		return courseRepository.save(c1);
	}
	
	

}
