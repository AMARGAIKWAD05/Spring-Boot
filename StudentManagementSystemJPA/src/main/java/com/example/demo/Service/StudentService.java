package com.example.demo.Service;

import java.util.List;

import com.example.demo.Entity.Student;

public interface StudentService {

	
	public Student addNewStudent(Student s);
	public List<Student> findAllStudents();
	public String deleteStudent(int id);
	public Student updateStudent(Student s);
	
}
