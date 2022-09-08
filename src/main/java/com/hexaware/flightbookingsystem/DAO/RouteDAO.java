package com.hexaware.flightbookingsystem.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hexaware.flightbookingsystem.entity.Route;
import com.hexaware.flightbookingsystem.repository.RouteRepository;

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
public class RouteDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Autowired
    private RouteRepository routeRepository;


    public List<Route> getRoutes() {
        return routeRepository.findAll();
    }

    public Route create(Route route) {
        return routeRepository.save(route);
    }

    public Optional<Route> findById(Long id) {
        return routeRepository.findById(id);
    }

    public List<Route> findByName(String name) {
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<Route> cq = cb.createQuery(Route.class);

        Root<Route> route = cq.from(Route.class);
        Predicate departurePredicate = cb.equal(route.get("departure"), name);
        Predicate arrivalPredicate = cb.equal(route.get("arrival"),name);
        Predicate routeNamePredicate = cb.or(departurePredicate,arrivalPredicate);
        cq.where(routeNamePredicate);

        TypedQuery<Route> query = entityManager.createQuery(cq);
        return query.getResultList();
    }
}
