package com.example.Springdemo12332;

import java.util.List;
import java.util.Set;

public class Employee {
	
	int eid;
	String name;
	int salary;
	List<String> Skills;
	
	Set<String> languages;
	
	public Set<String> getLanguages() {
		return languages;
	}
	public void setLanguages(Set<String> languages) {
		this.languages = languages;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public List<String> getSkills() {
		return Skills;
	}
	public void setSkills(List<String> skills) {
		Skills = skills;
	}
	public Employee(int eid, String name, int salary, List<String> skills) {
		super();
		this.eid = eid;
		this.name = name;
		this.salary = salary;
		Skills = skills;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
