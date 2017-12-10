package com.banking.api.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.banking.api.domain.Recipient;

public interface RecipientDao extends MongoRepository<Recipient, Long>{
	List<Recipient> findAll();

    Recipient findByName(String recipientName);

    void deleteByName(String recipientName);
}
