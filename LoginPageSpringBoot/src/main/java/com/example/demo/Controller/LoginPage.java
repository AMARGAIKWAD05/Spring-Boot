package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class LoginPage {
	
	@GetMapping("/home")
	public String home() {
		return "Welcome...";
	}
	

}
