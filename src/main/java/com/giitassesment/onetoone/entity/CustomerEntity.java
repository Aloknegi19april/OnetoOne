package com.giitassesment.onetoone.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "giitcustomer")
public class CustomerEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "customerid")
	private Integer customerId;
	
	@Column(name = "customername")
	private String customerName;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "addressid", unique = true)
	private AddressEntity addressEntity;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "accountno", unique = true)
	private AccountEntity accountEntity;
}