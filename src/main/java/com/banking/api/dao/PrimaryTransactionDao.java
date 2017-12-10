package com.banking.api.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.banking.api.domain.PrimaryTransaction;

public interface PrimaryTransactionDao extends MongoRepository<PrimaryTransaction, Long>{
	List<PrimaryTransaction> findAll();
}
