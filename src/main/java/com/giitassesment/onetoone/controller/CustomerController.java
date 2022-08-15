package com.giitassesment.onetoone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.giitassesment.onetoone.dto.CustomerDTO;
import com.giitassesment.onetoone.dto.ResponseDTO;
import com.giitassesment.onetoone.service.CustomerServiceInterface;

@RestController
public class CustomerController {
	
	@Autowired
	private CustomerServiceInterface customerServiceInterface;
	
	@GetMapping("/getdata")
	public CustomerDTO getCustomerData(@RequestParam Integer customerId) {
		
		return customerServiceInterface.getCustomerDetails(customerId);
	}
	
	@PostMapping("/addUser")
	public ResponseDTO addCustomerData(@RequestBody CustomerDTO customerDTO) {
		
		return customerServiceInterface.addNewCustomer(customerDTO);
	}
}
