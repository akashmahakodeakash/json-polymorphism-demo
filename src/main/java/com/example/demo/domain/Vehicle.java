package com.example.demo.domain;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import javax.validation.constraints.NotNull;

/**
 * Created by akashmahakode on 23/09/2017.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", visible = true)
@JsonSubTypes({
        @JsonSubTypes.Type(name = Vehicle.AEROPLANE, value = Aeroplane.class),
        @JsonSubTypes.Type(name = Vehicle.BICYCLE, value = Bicycle.class),
        @JsonSubTypes.Type(name = Vehicle.CAR, value = Car.class),
        @JsonSubTypes.Type(name = Vehicle.SCOOTER, value = Scooter.class),
        @JsonSubTypes.Type(name = Vehicle.TRUCK, value = Truck.class)
        })
public abstract class Vehicle {

    public static final String AEROPLANE = "AEROPLANE";
    public static final String BICYCLE = "BICYCLE";
    public static final String CAR = "CAR";
    public static final String SCOOTER = "SCOOTER";
    public static final String TRUCK = "TRUCK";

    @NotNull
    private String id;

    @NotNull
    private String type;

    protected Vehicle(){

    }

    protected Vehicle(String id, String type){
        this.id = id;
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
