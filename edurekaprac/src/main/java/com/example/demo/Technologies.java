package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Technologies {

	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public void tech() {
		System.out.println("Hello I am in Tech Method");
	}
}
