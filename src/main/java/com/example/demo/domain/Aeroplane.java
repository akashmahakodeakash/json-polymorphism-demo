package com.example.demo.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.annotation.sql.DataSourceDefinition;

/**
 * Created by akashmahakode on 23/09/2017.
 */
@Data
@AllArgsConstructor
public class Aeroplane extends Vehicle {

    private String producer;

    private int passengerCount;

    private int floorCount;

    private String operatingCompany;

    public Aeroplane(){

    }
}
