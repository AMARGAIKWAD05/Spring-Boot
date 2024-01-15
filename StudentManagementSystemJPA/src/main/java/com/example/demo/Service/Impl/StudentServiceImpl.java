package com.example.demo.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Student;
import com.example.demo.Repository.StudentRepository;
import com.example.demo.Service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepository studentRepository;
	
	@Override
	public Student addNewStudent(Student s) {
		// TODO Auto-generated method stub
		return studentRepository.save(s);
	}

	@Override
	public List<Student> findAllStudents() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}

	@Override
	public String deleteStudent(int sid) {
		// TODO Auto-generated method stub
		
		studentRepository.deleteById(sid);
		return "Student is deleted";
	}

	@Override
	public Student updateStudent(Student s) {
		// TODO Auto-generated method stub
		Student _s=studentRepository.findById(s.getSid()).get();
		_s.setMarks(s.getMarks());
		_s.setName(s.getName());
		
		return studentRepository.save(s);
	}

}
