package com.hexaware.flightbookingsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hexaware.flightbookingsystem.entity.Airport;

@Repository
public interface AirportRepository extends JpaRepository<Airport,Long> {
}
