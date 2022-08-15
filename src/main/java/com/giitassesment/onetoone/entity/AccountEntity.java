package com.giitassesment.onetoone.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "giitaccount")
public class AccountEntity {

	@Id
	@Column(name = "accountno")
	private Integer accountNo;
	
	@Column(name = "balance")
	private Long balance;
}
