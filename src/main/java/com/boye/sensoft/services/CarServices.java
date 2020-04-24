package com.boye.sensoft.services;

import com.boye.sensoft.entities.Car;
import com.boye.sensoft.repositories.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarServices {

    @Autowired
    private CarRepository carRepository ;

    public List<Car> findAll() {
        return carRepository.findAll();
    }

    public Car save(Car car) {

        return  carRepository.save(car);
    }

    public Optional<Car> findCarById(Long id) {
      return   carRepository.findById(id);
    }

    public void deleteById(Long id) {
        if(id != null) {
            carRepository.deleteById(id);
        }
    }

    public List<Car> searchCar(String libelle) {
        return  carRepository.findAllByLibelle(libelle);
    }
}
