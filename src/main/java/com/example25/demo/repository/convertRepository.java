package com.example25.demo.repository;

import com.example25.demo.model.Urls;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface convertRepository extends MongoRepository<Urls,Integer> {

}
