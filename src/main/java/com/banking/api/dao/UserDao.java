package com.banking.api.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.banking.api.domain.User;

public interface UserDao extends MongoRepository<User, Long>{
	User findByUsername(String username);
    User findByEmail(String email);
    List<User> findAll();
}
