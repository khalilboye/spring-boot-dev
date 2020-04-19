package com.boye.sensoft.repositories;

import com.boye.sensoft.entities.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Long> {
}
