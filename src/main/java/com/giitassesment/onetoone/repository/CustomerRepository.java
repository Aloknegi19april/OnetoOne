package com.giitassesment.onetoone.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.giitassesment.onetoone.entity.CustomerEntity;

public interface CustomerRepository extends JpaRepository<CustomerEntity, Integer>{

	Optional<CustomerEntity>  findByCustomerId(Integer customerId);
}
