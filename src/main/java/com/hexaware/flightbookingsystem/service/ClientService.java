package com.hexaware.flightbookingsystem.service;

import java.util.Optional;

import com.hexaware.flightbookingsystem.Exception.FlightNotFoundException;
import com.hexaware.flightbookingsystem.Exception.OverBookedException;
import com.hexaware.flightbookingsystem.entity.Booking;
import com.hexaware.flightbookingsystem.entity.Client;

public interface ClientService {

    public Client createClient(Client client);
    public Optional<Client> getClientByClientId(String clientId);
    public Client updateClient(Client client);
}
