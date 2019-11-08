package com.example.demo.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.model.Bank_Customer;
import com.example.demo.repository.Bank_CustomerRepository;

@RestController
@RequestMapping("/api/v1")

public class Bank_CustomerController {

	@Autowired
	private Bank_CustomerRepository customerRepository;

	@Autowired
	Environment env;

	@GetMapping("/customer")
	@CrossOrigin
	public List<Bank_Customer> getAllCustomers() {
		return customerRepository.findAll();
	}

	@GetMapping("/customer/{id}")
	@CrossOrigin
	public ResponseEntity<Bank_Customer> getCustomerById(@PathVariable(value = "id") Integer customerId)
			throws ResourceNotFoundException {
		Bank_Customer customer = customerRepository.findById(customerId)
				.orElseThrow(() -> new ResourceNotFoundException("Customer not found for id: " + customerId));
		return ResponseEntity.ok().body(customer);
	}

	@PostMapping("/customer")
	@CrossOrigin
	public Bank_Customer createCustomer(@Valid @RequestBody Bank_Customer customer) {
		return customerRepository.save(customer);
	}

	@DeleteMapping("/customer/{id}")
	@CrossOrigin
	public Map<String, Boolean> deleteCustomer(@PathVariable(value = "id") Integer customerId)
			throws ResourceNotFoundException {
		Bank_Customer customer = customerRepository.findById(customerId)
				.orElseThrow(() -> new ResourceNotFoundException("Customer not found for this id :: " + customerId));

		customerRepository.delete(customer);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return response;
	}

}
