package com.hexaware.flightbookingsystem.entity;


import javax.persistence.*;

@Entity
@Table(name="route")
public class Route {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long route_id;
    @Column(nullable = false)
    private String departure;
    @Column(nullable = false)
    private String arrival;

    public Route() {
    }

    public Route(String departure, String arrival) {
        this.departure = departure;
        this.arrival = arrival;
    }

    public Long getRoute_id() {
        return route_id;
    }

    public void setRoute_id(Long route_id) {
        this.route_id = route_id;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getArrival() {
        return arrival;
    }

    public void setArrival(String arrival) {
        this.arrival = arrival;
    }
}
