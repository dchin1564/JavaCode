package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.CustomerRepo;
import com.example.demo.model.Customer;

@RestController
public class CustomerController {
	
	@Autowired
	CustomerRepo customerRepository;
	
	@RequestMapping("/")
	public String home() {
		return "home.jsp";
	}
	
	@PostMapping(path = "/customer")
	public Customer addCustomer(@RequestBody Customer customer) {
		customerRepository.save(customer);
		return customer;

	}

}
