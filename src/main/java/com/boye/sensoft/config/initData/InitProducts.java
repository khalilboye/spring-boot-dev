package com.boye.sensoft.config.initData;

import com.boye.sensoft.entities.Car;
import com.boye.sensoft.repositories.CarRepository;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@Order(3)
public class InitProducts implements ApplicationRunner {

    public final CarRepository carRepository ;

    public InitProducts(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
       carRepository.save(new Car("car1", "bmw", "serie 1", new Date()));
        carRepository.save(new Car("car2", "onda", "5fg", new Date()));
        carRepository.save(new Car("car3", "toyota", "yaris", new Date()));
    }
}
