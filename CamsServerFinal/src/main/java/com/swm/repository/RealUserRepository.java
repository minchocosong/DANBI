package com.swm.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.swm.domain.RealUser;

public interface RealUserRepository extends MongoRepository<RealUser, String> {
	
	RealUser findByUserName(String name);

}
