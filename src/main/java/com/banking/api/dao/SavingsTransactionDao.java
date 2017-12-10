package com.banking.api.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.banking.api.domain.SavingsTransaction;

public interface SavingsTransactionDao extends MongoRepository<SavingsTransaction, Long>{
	List<SavingsTransaction> findAll();
}
