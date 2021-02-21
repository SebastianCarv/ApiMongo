package com.sebastian.ApiMongo.repository;


import com.sebastian.ApiMongo.entity.Car;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;


@Repository
public interface CarRepository extends MongoRepository <Car, Serializable> {
}
