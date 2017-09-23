package com.example.demo.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created by akashmahakode on 23/09/2017.
 */
@Data
@AllArgsConstructor
public class Truck extends Vehicle {

    private String company;

    private String country;

    private int wheelCount;

    public Truck(){

    }
}
