package com.codeclan.example.passengerservice.Controllers;

import com.codeclan.example.passengerservice.Models.CruiseShip;
import com.codeclan.example.passengerservice.Repositories.CruiseShipRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/cruiseShips")
public class CruiseShipController {

    @Autowired
    CruiseShipRepository cruiseShipRepository;

    @GetMapping(value = "/")
    public List<CruiseShip> getAllCruiseShips(){
        return cruiseShipRepository.findAll();
    }
}
