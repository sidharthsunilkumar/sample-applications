package com.example.demo.services;

import org.springframework.stereotype.Service;

@Service
public class DemoService implements IDemoService{

	@Override
	public String getDemoFunction() {
		System.out.println("Executing demo function");
		return "Hello";
	}

}
