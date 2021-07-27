package com.api.jenkinsdemo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
	
	@GetMapping("/hello")
	public String helloWorld() {
		return "Hello Kenny";
	}

	@GetMapping("/")
	public String base(){
		return "Simple API server started...";
	}
}
