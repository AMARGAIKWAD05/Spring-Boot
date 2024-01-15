package com.example.Entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Doctor {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Did;
	@NotEmpty(message = "Name can't be empty!")
	@Size(min = 3, max = 25, message = "Please enter proper name")
	@Column(length = 30)
	@Pattern(regexp = "^[a-zA-Z]*$", message = "Accepts only alphabets! re-enter the Name")
	private String Dname;
	@NotEmpty(message = "You can't keep doctor's contact Empty ")
	@Size(min = 10, max = 10, message = "Invalid Phone Number please enter a vaild phone number minimum of 10 digits")
	@Pattern(regexp = "^\\d{10}$", message = "Invalid input:Enter 10 digit numbers only")
	@Column(unique = true, length = 30)
	private String Dcontact;
	@NotEmpty(message = "You can't keep doctor'speciality Empty ")
	@Size(min = 3, max = 30, message = "Please Enter the speciality properly")
	@Pattern(regexp = "^[a-zA-Z]*$", message = "Use alphabets only")
	private String speciality;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "dr")
	@JsonIgnore
	List<Appointment> appointments;

}
