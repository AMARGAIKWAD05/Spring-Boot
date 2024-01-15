package com.example.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Entity.Appointment;
import com.example.Service.AppointmentService;

@RestController
public class AppointmentController {
	@Autowired

	AppointmentService appointmentService;

	@PostMapping("/appointments")
	public Appointment addNewAppointment(@RequestBody Appointment ap) {
		return appointmentService.addAppointment(ap);

	}

	@GetMapping("/appointment/{pname}")
	public List<Appointment> getAppointmentByPatientName(@PathVariable String pname) {
		return appointmentService.findPatientByName(pname);
	}

	@GetMapping("/appointments")
	public List<Appointment> getAllAppointment() {
		return appointmentService.getAllAppointments();

	}

	@GetMapping("/appointments/{id}")
	public Appointment getAppointmentById(@PathVariable int id) {
		return appointmentService.getAppointmentById(id);
	}

	@DeleteMapping("/appointments/{id}")
	public String deleteAppointment(@PathVariable int id) {
		return appointmentService.deleteAppointment(id);
	}

	@PutMapping("/appointments")
	public Appointment updateAppointment(@RequestBody Appointment ap) {
		return appointmentService.updateAppointment(ap);
	}

}
