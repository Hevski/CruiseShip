package com.codeclan.example.passengerservice;

import com.codeclan.example.passengerservice.Models.CruiseShip;
import com.codeclan.example.passengerservice.Models.Party;
import com.codeclan.example.passengerservice.Models.Passenger;
import com.codeclan.example.passengerservice.Repositories.CruiseShipRepository;
import com.codeclan.example.passengerservice.Repositories.PartyRepository;
import com.codeclan.example.passengerservice.Repositories.PassengerRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PassengerserviceApplicationTests {

	@Autowired
	PassengerRepository passengerRepository;

	@Autowired
	CruiseShipRepository cruiseShipRepository;

	@Autowired
	PartyRepository partyRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void createPassengerAndCruiseShipAndParty(){
		CruiseShip cruiseShip = new CruiseShip("Boaty McBoatFace");
		cruiseShipRepository.save(cruiseShip);
		Passenger passenger = new Passenger("Heather", "Malloch", 34, cruiseShip);
		passengerRepository.save(passenger);
		Party party = new Party("Rave_Room");
		partyRepository.save(party);
		passenger.addParty(party);
		passengerRepository.save(passenger);

	}
}
