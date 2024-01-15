package com.example.demo.Entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor //create no arguments constructor
@AllArgsConstructor  //create parameter constructor
@Data
public class Course {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	//list of the Course varible names
	private int cid;
	private String name;
	private String credit;
	private int Studentid;
	
	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER )  //many to one relationship
	@JoinColumn(name="sid")
	Student stud;

}
