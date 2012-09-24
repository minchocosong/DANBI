package com.swm.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.swm.domain.Counsel;

public interface CounselRepository extends MongoRepository<Counsel, String> {
}
