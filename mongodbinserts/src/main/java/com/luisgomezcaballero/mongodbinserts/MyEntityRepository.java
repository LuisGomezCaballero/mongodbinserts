package com.luisgomezcaballero.mongodbinserts;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface MyEntityRepository extends MongoRepository<MyEntity, String> {

}