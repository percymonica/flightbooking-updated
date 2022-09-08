package com.hexaware.flightbookingsystem.service;

import java.util.List;
import java.util.Optional;

import com.hexaware.flightbookingsystem.entity.Company;
import com.hexaware.flightbookingsystem.entity.Route;

public interface RouteService {

    public List<Route> getRoutes();
    public Route createRoute(Route route);
    public Optional<Route> findRouteById(Long id);
    public List<Route> findRouteByName(String routeName);
}
