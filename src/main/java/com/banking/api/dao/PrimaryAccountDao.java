package com.banking.api.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.banking.api.domain.PrimaryAccount;

public interface PrimaryAccountDao extends MongoRepository<PrimaryAccount, Long>{
	PrimaryAccount findByAccountNumber (int accountNumber);
}
