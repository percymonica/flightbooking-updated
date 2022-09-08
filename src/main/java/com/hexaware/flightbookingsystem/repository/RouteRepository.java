package com.hexaware.flightbookingsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hexaware.flightbookingsystem.entity.Route;

@Repository
public interface RouteRepository extends JpaRepository<Route,Long> {
}
