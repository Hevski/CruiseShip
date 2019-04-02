package com.codeclan.example.passengerservice.Repositories;

import com.codeclan.example.passengerservice.Models.CruiseShip;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CruiseShipRepository extends JpaRepository<CruiseShip, Long> {
}
