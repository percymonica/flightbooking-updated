package com.hexaware.flightbookingsystem.entity;

import javax.persistence.*;


@Entity
@Table(name="airport")
public class Airport {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long airport_id;
    @Column(nullable = false)
    private String airport_name;
    @Column(nullable = false)
    private String country;
    @Column(nullable = false)
    private String city;

    public Airport() {
    }

    public Airport(String airport_name, String country, String city) {
        this.airport_name = airport_name;
        this.country = country;
        this.city = city;
    }

    public Long getAirport_id() {
        return airport_id;
    }

    public void setAirport_id(Long airport_id) {
        this.airport_id = airport_id;
    }

    public String getAirport_name() {
        return airport_name;
    }

    public void setAirport_name(String airport_name) {
        this.airport_name = airport_name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
