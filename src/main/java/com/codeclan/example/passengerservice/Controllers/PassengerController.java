package com.codeclan.example.passengerservice.Controllers;

import com.codeclan.example.passengerservice.Models.Passenger;
import com.codeclan.example.passengerservice.Repositories.PassengerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/passengers")
public class PassengerController {

    @Autowired
    PassengerRepository passengerRepository;


    @GetMapping
    public List<Passenger> getAllPassengers() {
        return passengerRepository.findAll();
    }

    @GetMapping("{id}")
    public Optional<Passenger> getPassenger(@PathVariable Long id){
        return passengerRepository.findById(id);
    }
}
