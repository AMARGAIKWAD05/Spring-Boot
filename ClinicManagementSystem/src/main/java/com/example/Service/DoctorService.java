package com.example.Service;

import java.util.List;

import com.example.Entity.Doctor;
import com.example.ExceptionHandling.DoctorNotFoundException;

public interface DoctorService {

	public Doctor addDoctor(Doctor d);

	public List<Doctor> getAllDoctors();

	public Doctor getDoctorById(int id) throws DoctorNotFoundException;

	public String deleteDoctor(int id);

	public Doctor updateDoctor(Doctor d);

}
