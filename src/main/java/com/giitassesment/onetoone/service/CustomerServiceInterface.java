package com.giitassesment.onetoone.service;

import com.giitassesment.onetoone.dto.CustomerDTO;
import com.giitassesment.onetoone.dto.ResponseDTO;

public interface CustomerServiceInterface {

	public CustomerDTO getCustomerDetails(Integer customerId);
	public ResponseDTO addNewCustomer(CustomerDTO customerDTO);
}
