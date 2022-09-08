package com.hexaware.flightbookingsystem.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.hexaware.flightbookingsystem.entity.Airport;
import com.hexaware.flightbookingsystem.impl.AirportServiceImpl;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/airport")
public class AirportController {

    @Autowired
    private AirportServiceImpl airportService;

    @GetMapping
    public List<Airport> getAirports() {
        return airportService.getAirports();
    }
    
    
    @PostMapping("/createairport")
    public Airport createAirport(@RequestBody Airport airport){
        return airportService.createAirport(airport);
    }

    @GetMapping(value = "/byId/{airportId}")
    public Optional<Airport> findAirportById(@PathVariable("airportId")Long airportId)
    {
        return airportService.findAirportById(airportId);
    }

    @GetMapping(value = "/byName/{airportName}")
    public List<Airport> findAirportByName(@PathVariable("airportName")String airportName)
    {
        return airportService.findAirportByName(airportName);
    }
}
