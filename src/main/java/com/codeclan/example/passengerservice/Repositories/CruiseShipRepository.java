package com.codeclan.example.passengerservice.Repositories;

import com.codeclan.example.passengerservice.Models.CruiseShip;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CruiseShipRepository extends JpaRepository<CruiseShip, Long> {
}
