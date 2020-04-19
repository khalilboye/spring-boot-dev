package com.boye.sensoft.error;

public class CarNotFoundException extends RuntimeException {

    public CarNotFoundException(Long id) {
        super("Car not found "+id);
    }
}
