package com.example.CS310_WEATHERAPP.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class HelloController {

	//GET, POST
	
	
	
	@GetMapping("/sayhello")
	public String hello() {
		return "Hello, welcome to Spring Rest..";
	}
	
}
