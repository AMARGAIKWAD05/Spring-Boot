package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
	StudentService studentservice;
	
	@PostMapping("/students")
	public Student addStudent(@RequestBody Student s) {
		return studentservice.addNewStudent(s);
	}
	
	@GetMapping("/students")
	public List<Student> getAllStudents(){
		return studentservice.findAllStudents();
		
		}
	
	@GetMapping("/students/{id}")
	public String deleteStudentById(@PathVariable int id) {
		return studentservice.deleteStudent(id);
	}
	
	@PutMapping("/students")
	public Student updateStudent(@RequestBody Student s) {
		return studentservice.updateStudent(s);
	}

}
