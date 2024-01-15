package com.example.Controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Entity.Doctor;
import com.example.ExceptionHandling.DoctorNotFoundException;
import com.example.Service.DoctorService;

@RestController
public class DoctorController {
	@Autowired
	DoctorService doctorService;

	@PostMapping(path = "/doctors")
	public ResponseEntity<Object> createDoctor(@RequestBody @Valid Doctor doctor) {
		Doctor d = doctorService.addDoctor(doctor);
		return new ResponseEntity<Object>(d, HttpStatus.OK);
	}

	@GetMapping("/doctors")
	public List<Doctor> getAllDoctors() {
		return doctorService.getAllDoctors();

	}

	@GetMapping("/doctors/{id}")
	public Doctor getDoctorById(@PathVariable int id) throws DoctorNotFoundException {
		return doctorService.getDoctorById(id);
	}

	@DeleteMapping("doctors/{id}")
	public String deleteDoctor(@PathVariable int id) {
		return doctorService.deleteDoctor(id);
	}

}
