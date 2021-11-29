package com.example.demo.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Tax;
import com.example.demo.services.IDemoService;

@CrossOrigin
@RestController
public class DemoController {

	@Autowired
	IDemoService iDemoService;
	
	@GetMapping("/api/demoservice")
 	public String method1(){
 		return iDemoService.getDemoFunction();
 	}
	
	@PostMapping("/api/demoservice")
	public ResponseEntity<String> method2(@RequestBody Tax tax) {
		System.out.println(tax.getName());
		System.out.println(tax.getAmount());
//		return "hello";
		return new ResponseEntity<>("Bad gateway error",HttpStatus.BAD_GATEWAY);
	}
}
