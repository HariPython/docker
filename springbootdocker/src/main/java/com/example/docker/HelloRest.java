package com.example.docker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRest {
	
	public HelloRest() {
		
	}
	
	@GetMapping("/hello")
	public Customer getCustomer() {
		Customer customer = new Customer(10,"Suresh");
		return customer;
	}

}
