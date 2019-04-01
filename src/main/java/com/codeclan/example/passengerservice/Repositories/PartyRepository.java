package com.codeclan.example.passengerservice.Repositories;

import com.codeclan.example.passengerservice.Models.Party;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PartyRepository extends JpaRepository<Party, Long> {
}
