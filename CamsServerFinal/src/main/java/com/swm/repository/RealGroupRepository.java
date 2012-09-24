package com.swm.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.swm.domain.RealGroup;

public interface RealGroupRepository extends MongoRepository<RealGroup, String> {

}
