package com.giitassesment.onetoone.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.giitassesment.onetoone.entity.AccountEntity;

public interface AccountRepository extends JpaRepository<AccountEntity, Integer>{

	Optional<AccountEntity> findByAccountNo(Integer accountNo);
}
