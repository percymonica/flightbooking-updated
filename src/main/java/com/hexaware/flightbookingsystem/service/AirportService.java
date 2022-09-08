package com.hexaware.flightbookingsystem.service;

import java.util.List;
import java.util.Optional;

import com.hexaware.flightbookingsystem.entity.Airport;
import com.hexaware.flightbookingsystem.entity.Company;

public interface AirportService {

    public List<Airport> getAirports();
    public Airport createAirport(Airport airport);
    public Optional<Airport> findAirportById(Long id);
    public List<Airport> findAirportByName(String airportName);
}
