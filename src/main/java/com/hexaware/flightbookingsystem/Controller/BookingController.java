package com.hexaware.flightbookingsystem.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.hexaware.flightbookingsystem.Exception.BookingNotFoundException;
import com.hexaware.flightbookingsystem.Exception.FlightNotFoundException;
import com.hexaware.flightbookingsystem.Exception.OverBookedException;
import com.hexaware.flightbookingsystem.entity.Booking;
import com.hexaware.flightbookingsystem.entity.Client;
import com.hexaware.flightbookingsystem.service.BookingService;
import com.hexaware.flightbookingsystem.service.ClientService;

import java.util.Optional;

@RestController
@RequestMapping("/booking")
public class BookingController {

    @Autowired
    private BookingService bookingService;

    @Autowired
    private ClientService clientService;


    @GetMapping(value="/{bookingId}")
    public Optional<Booking> findBookingByBookingId(@PathVariable("bookingId")Long bookingId)
    {
        return bookingService.findBookingByBookingId(bookingId);
    }

    @PostMapping(value="/{flightId}")
    public Booking buyTicket(@RequestBody Client client, @PathVariable("flightId") Long flightId) throws FlightNotFoundException, OverBookedException {
        if(!clientService.getClientByClientId(client.getId_number()).isPresent())
        {
            clientService.createClient(client);
        }
        else
        {
            clientService.updateClient(client);
        }
        return bookingService.buyTicket(client,flightId);
    }

    @DeleteMapping(value="/{bookingId}")
    public boolean cancelTicket(@PathVariable("bookingId")Long bookingId) throws BookingNotFoundException {
        if(bookingService.findBookingByBookingId(bookingId).isPresent())
        {

            return bookingService.deleteBookingByBookingId(bookingId);
        }
        throw new BookingNotFoundException();
    }
}
