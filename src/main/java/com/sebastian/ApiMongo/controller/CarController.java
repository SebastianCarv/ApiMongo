package com.sebastian.ApiMongo.controller;

import com.sebastian.ApiMongo.entity.Car;
import com.sebastian.ApiMongo.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/car")
public class CarController {
    @Autowired
    private CarService carService;

    @GetMapping("/findall")

    // lleva identificador de acceso, tipo de dato que retorna, nombre de metodo y los parametros
    public List <Car> findAll(){
        return carService.findAll();

    }

    @GetMapping("/find/{id}")

    public Optional<Car> find(@PathVariable("id") String id){
        return carService.find(id);

    }

    @DeleteMapping ("/delete/{id}")
    public String delete(@PathVariable("id")String id){
        carService.delete(id);
        return id;
    }

    @PostMapping("/insert")

    public Car insert(@RequestBody Car insertCar ){
        return carService.create(insertCar);

    }

    @PutMapping("/update")
    public Car update(@RequestBody Car updateCar){
        return carService.update(updateCar);


    }


}
