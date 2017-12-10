package com.banking.api.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.banking.api.domain.security.Role;

public interface RoleDao extends MongoRepository<Role, Long>{
	Role findByName(String name);
}
