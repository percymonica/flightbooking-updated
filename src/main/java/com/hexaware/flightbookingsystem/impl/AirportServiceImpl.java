package com.hexaware.flightbookingsystem.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.flightbookingsystem.DAO.AirportDAO;
import com.hexaware.flightbookingsystem.entity.Airport;
import com.hexaware.flightbookingsystem.service.AirportService;

import java.util.List;
import java.util.Optional;

@Service
public class AirportServiceImpl implements AirportService {

    @Autowired
    private AirportDAO airportDAO;

    @Override
    public List<Airport> getAirports() {
        return airportDAO.getAirports();
    }

    @Override
    public Airport createAirport(Airport airport) {
        return airportDAO.create(airport);
    }

    @Override
    public Optional<Airport> findAirportById(Long id) {
        return airportDAO.findById(id);
    }

    @Override
    public List<Airport> findAirportByName(String airportName) {
        return airportDAO.findByName(airportName);
    }
}
