package com.banking.api.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.banking.api.domain.SavingsAccount;

public interface SavingsAccountDao extends MongoRepository<SavingsAccount, Long>{
	SavingsAccount findByAccountNumber (int accountNumber);
}
