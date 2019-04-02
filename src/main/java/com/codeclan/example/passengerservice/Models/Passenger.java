package com.codeclan.example.passengerservice.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "passengers")
public class Passenger {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "surname")
    private String surname;

    @Column(name = "age")
    private int age;

    @JsonIgnore
    @ManyToMany
    @JoinTable(
            name = "passengers_parties",
            joinColumns = { @JoinColumn(
                    name = "passenger_id",
                    nullable = false,
                    updatable = false)
            },
            inverseJoinColumns = {@JoinColumn(
                    name = "party_id",
                    nullable = false,
                    updatable = false)
            }
    )
    private List<Party> parties;

    @ManyToOne
    @JoinColumn(name = "cruiseShip_id", nullable = false)
    private CruiseShip cruiseShip;

    public Passenger(String firstName, String surname, int age, CruiseShip cruiseShip) {
        this.firstName = firstName;
        this.surname = surname;
        this.age = age;
        this.cruiseShip = cruiseShip;
        this.parties = new ArrayList<Party>();
    }

    public Passenger() {
    }

    public Long getId() {
        return id;
    }

    public List<Party> getParties() {
        return parties;
    }

    public void setParties(List<Party> parties) {
        this.parties = parties;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public CruiseShip getCruiseShip() {
        return cruiseShip;
    }

    public void setCruiseShip(CruiseShip cruiseShip) {
        this.cruiseShip = cruiseShip;
    }

    public void addParty(Party party){
        this.parties.add(party);
    }




}
