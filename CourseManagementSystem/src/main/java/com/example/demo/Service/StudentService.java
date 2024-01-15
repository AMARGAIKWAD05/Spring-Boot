package com.example.demo.Service;

import java.util.List;

import com.example.demo.Entity.Student;

public interface StudentService {
	                                         // list of abstract methods
	public Student addStudent(Student stud);
	public List<Student> getAllStudents();
	public Student getStudentById(int sid);
	public String deleteStudent (int sid);
	public Student updateStudent(Student stud);
	
	
	
	

}
