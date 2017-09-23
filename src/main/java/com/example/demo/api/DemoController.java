package com.example.demo.api;

import com.example.demo.domain.Vehicle;
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
    public ResponseEntity<Vehicle> createVehicle(@Valid @RequestBody Vehicle vehicle){

        Vehicle newVehicle =  null;

        return new ResponseEntity<>(newVehicle, HttpStatus.OK);
    }

}
