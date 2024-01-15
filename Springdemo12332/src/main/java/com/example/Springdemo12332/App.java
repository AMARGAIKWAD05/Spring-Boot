package com.example.Springdemo12332;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		ApplicationContext con = new ClassPathXmlApplicationContext("config.xml");

		//Vehicle obj = (Vehicle) con.getBean("vehicle");
		//obj.drive();
		//System.out.println("Hello World!");
		
		
		
		Employee e=(Employee) con.getBean("e1");
		System.out.println("eid"+ e.getEid());
		System.out.println("name"+ e.getName());
		System.out.println("salary"+ e.getSalary());
		List<String> lists=e.getSkills();
		for(String s:lists) {
			System.out.println("Skills are  "+ s);
		}
		
		
		
	}
}
