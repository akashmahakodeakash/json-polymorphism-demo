package com.example.demo.api;

import com.example.demo.domain.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * Created by akashmahakode on 23/09/2017.
 */

@RestController
@RequestMapping(value = "/vehicles")
public class DemoController {

    @PostMapping(value = {"/", ""}, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Vehicle> createVehicle(@Valid @RequestBody Vehicle vehicle) {

        switch (vehicle.getType()) {
            case Vehicle.AEROPLANE:
                return new ResponseEntity<>((Aeroplane) vehicle, HttpStatus.OK);
            case Vehicle.CAR:
                return new ResponseEntity<>((Car) vehicle, HttpStatus.OK);
            case Vehicle.BICYCLE:
                return new ResponseEntity<>((Bicycle) vehicle, HttpStatus.OK);
            case Vehicle.TRUCK:
                new ResponseEntity<>((Truck) vehicle, HttpStatus.OK);
        }

        return null;
    }
}
