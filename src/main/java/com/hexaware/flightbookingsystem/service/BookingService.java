package com.hexaware.flightbookingsystem.service;

import java.util.Optional;

import com.hexaware.flightbookingsystem.Exception.FlightNotFoundException;
import com.hexaware.flightbookingsystem.Exception.OverBookedException;
import com.hexaware.flightbookingsystem.entity.Booking;
import com.hexaware.flightbookingsystem.entity.Client;

public interface BookingService {

     Optional<Booking> findBookingByBookingId(Long bookingId);
     Booking buyTicket(Client client, Long flightId) throws FlightNotFoundException, OverBookedException;
     boolean deleteBookingByBookingId(Long bookingId);
}
