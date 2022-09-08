package com.hexaware.flightbookingsystem.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.flightbookingsystem.DAO.ClientDAO;
import com.hexaware.flightbookingsystem.entity.Client;
import com.hexaware.flightbookingsystem.service.ClientService;

import java.util.Optional;

@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    private ClientDAO clientDAO;

    @Override
    public Client createClient(Client client) {
        return clientDAO.create(client);
    }

    @Override
    public Optional<Client> getClientByClientId(String clientId) {
        return clientDAO.getCustomerByClientId(clientId);
    }

    @Override
    public Client updateClient(Client client) {
        return clientDAO.update(client);
    }
}
