package com.hexaware.flightbookingsystem.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.hexaware.flightbookingsystem.Exception.FlightNotFoundException;
import com.hexaware.flightbookingsystem.entity.Flight;
import com.hexaware.flightbookingsystem.impl.FlightServiceImpl;

import java.util.Optional;

@RestController
@RequestMapping("/flight")
public class FlightController {

    @Autowired
    private FlightServiceImpl flightService;

    @PostMapping
    public Flight insertFlight(@RequestBody Flight flight)
    {
        return flightService.createFlight(flight);
    }

    @GetMapping(value = "/{flightId}")
    public Optional<Flight> findAirportById(@PathVariable("flightId")Long flightId) throws FlightNotFoundException {
        return flightService.findFlightById(flightId);
    }
}
