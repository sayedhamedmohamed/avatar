package com.integrant.aptar.pharma.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.integrant.aptar.pharma.model.Bag;

/**
 * The Interface BagsRepository.
 */
@Repository
public interface BagsRepository extends MongoRepository<Bag, String>{

}
