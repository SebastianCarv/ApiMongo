package com.sebastian.ApiMongo.service;

import com.sebastian.ApiMongo.entity.Car;
import com.sebastian.ApiMongo.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

@Service

public class CarService {
    @Autowired
    private CarRepository carRespository;

    public List<Car> findAll (){

        //Aqui consulto todos los autos de la coleccion (no es entidad por mongo) de "Car" con el metodo de mongo .findAll
        List<Car> carros = carRespository.findAll();

        //Aqui se retornan todos
        return carros;
    }

    public Optional<Car> find(String id){
        Optional<Car> carros = carRespository.findById(id);
        return carros;

    }

    public void delete(String id){
       carRespository.deleteById(id);

    }
    public Car create(Car car){
        Car newcar = carRespository.save(car);
        return newcar;
    }

    public Car update(Car car){
        Car updatecar = carRespository.save(car);
        return updatecar;

    }

}
