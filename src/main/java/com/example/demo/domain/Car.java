package com.example.demo.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created by akashmahakode on 23/09/2017.
 */
@Data
@AllArgsConstructor
public class Car extends Vehicle{

    private String manufacturer;

    private String country;

    private String numberPlate;

    // petrol or diesel
    private String fuel;

    public Car(){

    }
}
