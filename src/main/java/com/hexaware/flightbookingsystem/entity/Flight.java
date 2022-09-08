package com.hexaware.flightbookingsystem.entity;


import javax.persistence.*;

@Entity
@Table(name="flight")
public class Flight {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long flight_id;
    @OneToOne(cascade = CascadeType.ALL , orphanRemoval = true)
    @JoinColumn(name = "company_id")
    private Company company;
    @OneToOne(cascade = CascadeType.ALL , orphanRemoval = true)
    @JoinColumn(name = "route_id")
    private Route route;
    @OneToOne(cascade = CascadeType.ALL , orphanRemoval = true)
    @JoinColumn(name = "airport_id")
    private Airport airport;
    @Column(nullable = false)
    private int quota_count;
    @Column(nullable = false)
    private int booking_count;
    @Column(nullable = false)
    private double price;

    public Flight() {
    }

    public Flight(Company company, Route route, Airport airport, int quota_count, int booking_count, double price) {
        this.company = company;
        this.route = route;
        this.airport = airport;
        this.quota_count = quota_count;
        this.booking_count = booking_count;
        this.price = price;
    }

    public Long getFlight_id() {
        return flight_id;
    }

    public void setFlight_id(Long flight_id) {
        this.flight_id = flight_id;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }

    public Airport getAirport() {
        return airport;
    }

    public void setAirport(Airport airport) {
        this.airport = airport;
    }

    public int getQuota_count() {
        return quota_count;
    }

    public void setQuota_count(int quota_count) {
        this.quota_count = quota_count;
    }

    public int getBooking_count() {
        return booking_count;
    }

    public void setBooking_count(int booking_count) {
        this.booking_count = booking_count;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
