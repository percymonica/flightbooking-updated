package com.hexaware.flightbookingsystem.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.flightbookingsystem.DAO.RouteDAO;
import com.hexaware.flightbookingsystem.entity.Route;
import com.hexaware.flightbookingsystem.repository.RouteRepository;
import com.hexaware.flightbookingsystem.service.RouteService;

import java.util.List;
import java.util.Optional;

@Service
public class RouteServiceImpl implements RouteService {

    @Autowired
    private RouteDAO routeDAO;

    @Override
    public List<Route> getRoutes() {
        return routeDAO.getRoutes();
    }

    @Override
    public Route createRoute(Route route) {
        return routeDAO.create(route);
    }

    @Override
    public Optional<Route> findRouteById(Long id) {
        return routeDAO.findById(id);
    }

    @Override
    public List<Route> findRouteByName(String routeName) {
        return routeDAO.findByName(routeName);
    }
}
