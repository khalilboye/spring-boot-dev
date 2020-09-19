package com.boye.sensoft.controller;

import com.boye.sensoft.entities.Car;
import com.boye.sensoft.error.CarNotFoundException;
import com.boye.sensoft.error.CarUnSupportedFieldPatchException;
import com.boye.sensoft.repositories.CarRepository;
import com.boye.sensoft.services.CarServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("api")
public class CarController {

    @Autowired
    private CarServices carServices ;

    @GetMapping("/all-cars")
    List<Car> findAll() {
        return carServices.findAll();
    }

    // Save
    //return 201 instead of 200
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/add-cars")
    Car newCar(@RequestBody @Valid Car car) {
        return carServices.save(car);
    }

    // Find
    @GetMapping("/cars/{id}")
    Car findOneCar(@PathVariable @Min(1) Long id) {
            return carServices.findCarById(id)
                    .orElseThrow(() -> new CarNotFoundException(id));
    }
    @GetMapping("/search")
    List<Car> searchCar(@Param("libelle") String libelle){
        return carServices.searchCar(libelle);
    }

    // Save or update
    @PutMapping("/cars/{id}")
    Car saveOrUpdateCar(@RequestBody @Valid Car car, @PathVariable Long id) {

        return carServices.findCarById(id)
                .map(x -> {
                    x.setLibelle(car.getLibelle());
                    x.setMarque(car.getMarque());
                    x.setModele(car.getModele());
                    return carServices.save(x);
                })
                .orElseGet(() -> {
                    car.setId(id);
                    return carServices.save(car);
                });
    }

    // update author only
    @PatchMapping("/cars/{id}")
    Car patch(@RequestBody Map<String, String> update, @PathVariable Long id) {

        return carServices.findCarById(id)
                .map(x -> {

                    String libelle = update.get("libelle");
                    if (!StringUtils.isEmpty(libelle)) {
                        x.setLibelle(libelle);

                        // better create a custom method to update a value = :newValue where id = :id
                        return carServices.save(x);
                    } else {
                        throw new CarUnSupportedFieldPatchException(update.keySet());
                    }

                })
                .orElseGet(() -> {
                    throw new CarNotFoundException(id);
                });

    }

    @DeleteMapping("/cars/{id}")
    void deleteBook(@PathVariable Long id) {
        carServices.deleteById(id);
    }


}
