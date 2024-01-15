package com.example.Service.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Entity.Doctor;
import com.example.ExceptionHandling.DoctorNotFoundException;
import com.example.Repository.DoctorRepository;
import com.example.Service.DoctorService;

@Service
public class DoctorServiceImpl implements DoctorService {

	@Autowired
	DoctorRepository doctorRepository;

	@Override
	public Doctor addDoctor(Doctor d) {
		// TODO Auto-generated method stub
		return doctorRepository.save(d);
	}

	@Override
	public List<Doctor> getAllDoctors() {
		// TODO Auto-generated method stub
		return doctorRepository.findAll();
	}

	@Override
	public Doctor getDoctorById(int id) throws DoctorNotFoundException {

		Optional<Doctor> option = doctorRepository.findById(id);
		if (option.isPresent()) {
			return doctorRepository.findById(id).get();
		} else {
			throw new DoctorNotFoundException("Doctor not available in database");
		}

		// TODO Auto-generated method stub

	}

	@Override
	public String deleteDoctor(int id) {
		// TODO Auto-generated method stub
		doctorRepository.deleteById(id);
		return "Doctor is deleted";
	}

	@Override
	public Doctor updateDoctor(Doctor d) {
		// TODO Auto-generated method stub
		Doctor _dr = doctorRepository.findById(d.getDid()).get();
		_dr.setDname(d.getDname());
		_dr.setDcontact(d.getDcontact());
		return doctorRepository.save(_dr);
	}

}
