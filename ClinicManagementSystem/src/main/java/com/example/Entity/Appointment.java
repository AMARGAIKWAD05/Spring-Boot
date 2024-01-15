package com.example.Entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Appointment {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int aid;
	private String pname;
	private String pcontact;
	private String speciality;
	private int doctor_id;
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)

	Doctor dr;

}
