package com.hexaware.flightbookingsystem.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hexaware.flightbookingsystem.entity.Airport;
import com.hexaware.flightbookingsystem.repository.AirportRepository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.List;
import java.util.Optional;

@Component
public class AirportDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Autowired
    private AirportRepository airportRepository;


    public List<Airport> getAirports() {
        return airportRepository.findAll();
    }

    public Airport create(Airport airport) {
        return airportRepository.save(airport);
    }

    public Optional<Airport> findById(Long id) {
        return airportRepository.findById(id);
    }

    public List<Airport> findByName(String name) {
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<Airport> cq = cb.createQuery(Airport.class);

        Root<Airport> airport = cq.from(Airport.class);
        Predicate airportNamePredicate = cb.equal(airport.get("airport_name"), name);
        cq.where(airportNamePredicate);

        TypedQuery<Airport> query = entityManager.createQuery(cq);
        return query.getResultList();
    }

}
