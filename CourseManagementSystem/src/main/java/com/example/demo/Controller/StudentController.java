package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Student;
import com.example.demo.Service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	StudentService studentService;              //create the StudentService object lossesly coupled
	
	@PostMapping("/students")                             //post the value in the databse  
	public Student addStudent(@RequestBody Student student ) {
		
		return studentService.addStudent(student);
	}
	
	@GetMapping("/students")                                 //return the all tables values 
	public List<Student> getAllStudents(){
		return studentService.getAllStudents();
	}
	
	@GetMapping("/students/{sid}")                                           //return the perticul student
	public Student getStudentById(@PathVariable int sid) {
		
	return studentService.getStudentById(sid);	
	}
	
	@DeleteMapping("students/{sid}")                                  //delete the perticular Course
	public String deleteStudent(@PathVariable int sid) {
		return studentService.deleteStudent(sid);
	}
	
	@PutMapping("Students")                                        //update the student data
	public Student updateStudent(@RequestBody Student student) {
		return studentService.updateStudent(student);
	}

}
