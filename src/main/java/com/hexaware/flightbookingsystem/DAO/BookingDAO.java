package com.hexaware.flightbookingsystem.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hexaware.flightbookingsystem.entity.Booking;
import com.hexaware.flightbookingsystem.repository.BookingRepository;

import java.util.Optional;

@Component
public class BookingDAO {

    @Autowired
    private BookingRepository bookingRepository;

    public Booking createBooking (Booking booking){
        return bookingRepository.save(booking);
    }

    public Optional<Booking> findBookingByBookingId(Long bookingId){
        return bookingRepository.findById(bookingId);
    }

    public void deleteBooking(Long bookingId)
    {
         bookingRepository.deleteById(bookingId);
    }

}
