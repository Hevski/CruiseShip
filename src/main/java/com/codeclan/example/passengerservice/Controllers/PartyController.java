package com.codeclan.example.passengerservice.Controllers;

import com.codeclan.example.passengerservice.Models.Party;
import com.codeclan.example.passengerservice.Repositories.PartyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/parties")
public class PartyController {

    @Autowired
    PartyRepository partyRepository;

    @GetMapping(value = "/")
    public List<Party> getAllRaids(){
        return partyRepository.findAll();
    }
}
