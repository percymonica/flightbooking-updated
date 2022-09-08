package com.hexaware.flightbookingsystem.entity;

import javax.persistence.*;

@Entity
@Table(name="booking")
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long booking_id;
    @Column(nullable = false)
    private String client_id;
    @ManyToOne
    @JoinColumn(name = "flight_id")
    private Flight flight;
    @Column(nullable = false)
    private int seat_no;
    @Column(nullable = false)
    private double price;

    public Booking() {
    }

    public Booking(String client_id, Flight flight, int seat_no, double price) {
        this.client_id = client_id;
        this.flight = flight;
        this.seat_no = seat_no;
        this.price = price;
    }

    public Long getBooking_id() {
        return booking_id;
    }

    public void setBooking_id(Long booking_id) {
        this.booking_id = booking_id;
    }

    public String getClient_id() {
        return client_id;
    }

    public void setClient_id(String client_id) {
        this.client_id = client_id;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public int getSeat_no() {
        return seat_no;
    }

    public void setSeat_no(int seat_no) {
        this.seat_no = seat_no;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
