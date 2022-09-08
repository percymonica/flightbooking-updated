package com.hexaware.flightbookingsystem.service;

import java.util.Optional;

import com.hexaware.flightbookingsystem.Exception.FlightNotFoundException;
import com.hexaware.flightbookingsystem.entity.Flight;


public interface FlightService {

    public Flight createFlight(Flight flight);
    public Optional<Flight> findFlightById(Long id);
    public Flight updateFlightBookingCountAndPrice(Long id);
    public Flight decrementFlightBookingCount(Long id) throws FlightNotFoundException;
}
