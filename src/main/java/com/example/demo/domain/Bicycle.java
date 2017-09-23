package com.example.demo.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created by akashmahakode on 23/09/2017.
 */
@Data
@AllArgsConstructor
public class Bicycle extends Vehicle{
    // mode can be electric or manual
    private String mode;

    private int weight;

    // Shimano or SRAM
    private String gearset;

    public Bicycle(){

    }
}
