package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class demo {

	@RequestMapping("hello")
	public String display() {
		return "Hello World";
	}
	
}
