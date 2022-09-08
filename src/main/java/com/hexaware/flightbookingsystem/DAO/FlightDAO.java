package com.hexaware.flightbookingsystem.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hexaware.flightbookingsystem.entity.Flight;
import com.hexaware.flightbookingsystem.repository.FlightRepository;

import java.util.Optional;

@Component
public class FlightDAO {

    @Autowired
    private FlightRepository flightRepository;

    public Flight create(Flight flight) {
        return flightRepository.save(flight);
    }

    public Optional<Flight> findById(Long id) {
        return flightRepository.findById(id);
    }
    public Flight update (Flight flight){return flightRepository.save(flight);}
}
