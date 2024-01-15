package com.example.demo.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Course;

import com.example.demo.Service.CourseService;

@RestController
public class CourseController {
	
	CourseService courseService;  //create the CourseService object lossesly coupled
	
	@PostMapping("/courses")     //post the value in the databse 
	public Course addStudent(@RequestBody Course course ) {
		
		return courseService.addCourse(course);
	}
	
	@GetMapping("/courses")                       //return the all tables values
	public List<Course> getAllCourses(){
		return courseService.getAllCourses();
	}
	
	@GetMapping("/courses/{cid}")                              //return the perticular value
	public Course getCourseById(@PathVariable int cid) {
		
	return courseService.getCourseById(cid);	
	}
	
	@DeleteMapping("courses/{cid}")                          //delete the perticular Course
	public String deleteCourse(@PathVariable int cid) {
		return courseService.deleteCourse(cid);
	}
	
	@PutMapping("courses")                                       //update the data
	public Course updateCourse(@RequestBody Course course) {
		return courseService.updateCourse(course);
	}

}
