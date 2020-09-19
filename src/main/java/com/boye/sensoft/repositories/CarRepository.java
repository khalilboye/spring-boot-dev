package com.boye.sensoft.repositories;

import com.boye.sensoft.entities.Car;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CarRepository extends JpaRepository<Car, Long> {
    List<Car> findAllByLibelle(String libelle);
}
