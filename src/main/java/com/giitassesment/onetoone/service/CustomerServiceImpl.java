package com.giitassesment.onetoone.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.giitassesment.onetoone.dto.CustomerDTO;
import com.giitassesment.onetoone.dto.ResponseDTO;
import com.giitassesment.onetoone.entity.AccountEntity;
import com.giitassesment.onetoone.entity.AddressEntity;
import com.giitassesment.onetoone.entity.CustomerEntity;
import com.giitassesment.onetoone.repository.AccountRepository;
import com.giitassesment.onetoone.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerServiceInterface{

	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
	private AccountRepository accountRepository;
	
	@Override
	public CustomerDTO getCustomerDetails(Integer customerId) {
		
		Optional<CustomerEntity> optional =  customerRepository.findByCustomerId(customerId);
		
		CustomerDTO customerDTO = new CustomerDTO();
		
		if(!optional.isEmpty()) {
			CustomerEntity customerEntity = optional.get();
			customerDTO.setCustomerId(customerId);
			customerDTO.setCustomerName(customerEntity.getCustomerName());
	
			customerDTO.setHouseNo(customerEntity.getAddressEntity().getHouseNo());
			customerDTO.setStreet(customerEntity.getAddressEntity().getStreet());
			customerDTO.setCity(customerEntity.getAddressEntity().getCity());
			customerDTO.setState(customerEntity.getAddressEntity().getState());
			
			customerDTO.setAccountNo(customerEntity.getAccountEntity().getAccountNo());
			customerDTO.setBalance(customerEntity.getAccountEntity().getBalance());
			
			customerDTO.setRemarks("Customer Data Fetched");
			return customerDTO;
		}
		
		customerDTO.setRemarks("Customer not exist");
		return customerDTO;
	}

	@Override
	public ResponseDTO addNewCustomer(CustomerDTO customerDTO) {
		
		Optional<AccountEntity> optional = accountRepository.findByAccountNo(customerDTO.getAccountNo());
		
		ResponseDTO responseDTO = new ResponseDTO();
		
		if(!optional.isEmpty()) {
			
			responseDTO.setResponse(Boolean.FALSE);
			responseDTO.setResponseMessage("Account No. already exist");
			return responseDTO;
		}
		
		CustomerEntity customerEntity = new CustomerEntity();
		customerEntity.setCustomerName(customerDTO.getCustomerName());
		
		AddressEntity addressEntity = new AddressEntity();
		addressEntity.setHouseNo(customerDTO.getHouseNo());
		addressEntity.setStreet(customerDTO.getStreet());
		addressEntity.setCity(customerDTO.getCity());
		addressEntity.setState(customerDTO.getState());	
		
		customerEntity.setAddressEntity(addressEntity);
		
		AccountEntity accountEntity = new AccountEntity();
		accountEntity.setAccountNo(customerDTO.getAccountNo());
		accountEntity.setBalance(customerDTO.getBalance());
		
		customerEntity.setAccountEntity(accountEntity);
		
		customerRepository.save(customerEntity);
		
		responseDTO.setResponse(Boolean.TRUE);
		responseDTO.setResponseMessage("Account Added Successfully");
		return responseDTO;
	}
}
