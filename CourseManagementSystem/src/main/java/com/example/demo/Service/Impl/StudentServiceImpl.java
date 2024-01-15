package com.example.demo.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Student;
import com.example.demo.Repository.StudentRepository;
import com.example.demo.Service.StudentService;



@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	StudentRepository studentRepository;
	                                    // override the all Student abstract methods
	@Override
	public Student addStudent(Student stud) {
		// TODO Auto-generated method stub
		return studentRepository.save(stud);
	}

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}

	@Override
	public Student getStudentById(int sid) {
		// TODO Auto-generated method stub
		return studentRepository.findById(sid).get();
	}

	@Override
	public String deleteStudent(int sid) {
		// TODO Auto-generated method stub
		studentRepository.deleteById(sid);
		return "Student deleted";
	}
	

	@Override
	public Student updateStudent(Student stud) {
		// TODO Auto-generated method stub
		// override the all Course abstract methods
		Student stu= studentRepository.findById(stud.getSid()).get();
		stu.setFname(stud.getFname());
		stu.setLname(stud.getLname());
		stu.setEmail(stud.getEmail());
		
		return studentRepository.save(stud);
	}
	

	
}
