package com.Anudip.HospitalManagement;


import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name="HospitalAppointment")
public class Appointment {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int aid;
	private String patientname;
	private String patientcontact;
	private String Date;
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getPatientname() {
		return patientname;
	}
	public void setPatientname(String patientname) {
		this.patientname = patientname;
	}
	public String getPatientcontact() {
		return patientcontact;
	}
	public void setPatientcontact(String patientcontact) {
		this.patientcontact = patientcontact;
	}
	public String getDate() {
		return Date;
	}
	public void setDate(String Date) {
		this.Date = Date;
	}
	public Appointment() {
		
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
