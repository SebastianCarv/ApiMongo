package com.sebastian.ApiMongo.entity;

import com.mongodb.lang.NonNull;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Document(collection = "cars")

public class Car implements Serializable {
    @Id
    @NonNull
    private String _id;
    @NonNull
    private String model;
    @NonNull
    private String brand;
    @NonNull
    private Integer year;
    
}
