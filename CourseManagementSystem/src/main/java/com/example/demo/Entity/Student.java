package com.example.demo.Entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Entity
@NoArgsConstructor   //create no arguments constructor
@AllArgsConstructor    //create parameter constructor
@Data
public class Student {
	
	@Id     //assing primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY)  //generate unique id
	
	//list of the student varible 
	private int sid;
	private String Fname;
	private String Lname;
	private String email;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "stud")
	@JsonIgnore
	List<Course> courses;

}
