package com.giitassesment.onetoone.dto;

import lombok.Data;

@Data
public class CustomerDTO {

	private Integer customerId;
	private String customerName;
	private Integer houseNo;
	private String street;
	private String city;
	private String state;
	private Integer accountNo;
	private Long balance;
	private String remarks;
}
