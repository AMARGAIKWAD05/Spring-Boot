package com.example.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Entity.Appointment;
import com.example.Entity.Doctor;
import com.example.Repository.AppointmentRepository;
import com.example.Repository.DoctorRepository;
import com.example.Service.AppointmentService;

@Service
public class AppointmentServiceImpl implements AppointmentService {
	@Autowired
	AppointmentRepository appointmentRepository;
	@Autowired
	DoctorRepository doctorRepository;

	@Override
	public Appointment addAppointment(Appointment ap) {
		// TODO Auto-generated method stub

		Doctor _dr = doctorRepository.findById(ap.getDoctor_id()).get();
		ap.setDr(_dr);
		return appointmentRepository.save(ap);
	}

	@Override
	public List<Appointment> getAllAppointments() {
		// TODO Auto-generated method stub
		return appointmentRepository.findAll();
	}

	@Override
	public Appointment getAppointmentById(int id) {
		// TODO Auto-generated method stub
		return appointmentRepository.findById(id).get();
	}

	@Override
	public String deleteAppointment(int id) {
		// TODO Auto-generated method stub
		appointmentRepository.deleteById(id);
		return "Appointment is deleted";
	}

	@Override
	public Appointment updateAppointment(Appointment ap) {
		// TODO Auto-generated method stub
		Appointment _ap = appointmentRepository.findById(ap.getAid()).get();
		_ap.setPname(ap.getPname());
		_ap.setPcontact(ap.getPcontact());
		_ap.setSpeciality(ap.getSpeciality());
		return appointmentRepository.save(_ap);
	}

	@Override
	public List<Appointment> findPatientByName(String name) {
		// TODO Auto-generated method stub
		return appointmentRepository.findAppointmentByPname(name);
	}

}
