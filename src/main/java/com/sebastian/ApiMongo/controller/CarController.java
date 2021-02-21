package com.sebastian.ApiMongo.controller;

import com.sebastian.ApiMongo.entity.Car;
import com.sebastian.ApiMongo.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/car")
public class CarController {
    @Autowired
    private CarService carService;

    @GetMapping("/findall")

    // lleva identificador de acceso, tipo de dato que retorna, nombre de metodo y los parametros
    public ResponseEntity<List <Car>> findAll(){
        return new ResponseEntity <>(carService.findAll(), HttpStatus.OK);

    }

    @GetMapping("/find/{id}")

    public Optional<Car> find(@PathVariable("id") String id){
        return carService.find(id);

    }



}
