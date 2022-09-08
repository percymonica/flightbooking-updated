package com.hexaware.flightbookingsystem.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.flightbookingsystem.DAO.BookingDAO;
import com.hexaware.flightbookingsystem.Exception.FlightNotFoundException;
import com.hexaware.flightbookingsystem.Exception.OverBookedException;
import com.hexaware.flightbookingsystem.entity.Booking;
import com.hexaware.flightbookingsystem.entity.Client;
import com.hexaware.flightbookingsystem.entity.Flight;
import com.hexaware.flightbookingsystem.service.BookingService;
import com.hexaware.flightbookingsystem.service.FlightService;

import java.util.Optional;
import java.util.Random;

@Service
public class BookingServiceImpl implements BookingService {

    @Autowired
    private BookingDAO bookingDAO;

    @Autowired
    private FlightService flightService;

    @Override
    public Optional<Booking> findBookingByBookingId(Long bookingId) {
        return bookingDAO.findBookingByBookingId(bookingId);
    }

    @Override
    public Booking buyTicket(Client client, Long flightId) throws FlightNotFoundException, OverBookedException {
        Random rand = new Random();
        Booking bookingRec =  new Booking();
        Flight requestedFlight= flightService.findFlightById(flightId)
                .orElseThrow(FlightNotFoundException::new);
        if(requestedFlight.getBooking_count()<requestedFlight.getQuota_count())
        {
            bookingRec.setClient_id(client.getId_number());
            bookingRec.setFlight(requestedFlight);
            bookingRec.setSeat_no(rand.nextInt(requestedFlight.getQuota_count()));
            bookingRec.setPrice(requestedFlight.getPrice());

            flightService.updateFlightBookingCountAndPrice(requestedFlight.getFlight_id());
            return bookingDAO.createBooking(bookingRec);
        }else{
            throw new OverBookedException();
        }

    }

    @Override
    public boolean deleteBookingByBookingId(Long bookingId) {
        bookingDAO.deleteBooking(bookingId);
        return true;
    }
}
