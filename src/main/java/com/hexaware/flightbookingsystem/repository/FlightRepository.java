package com.hexaware.flightbookingsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hexaware.flightbookingsystem.entity.Company;
import com.hexaware.flightbookingsystem.entity.Flight;

@Repository
public interface FlightRepository extends JpaRepository<Flight,Long> {

}
