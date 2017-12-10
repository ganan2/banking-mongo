package com.banking.api.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.banking.api.domain.Appointment;

public interface AppointmentDao extends MongoRepository<Appointment, Long>{
	List<Appointment> findAll();
}
