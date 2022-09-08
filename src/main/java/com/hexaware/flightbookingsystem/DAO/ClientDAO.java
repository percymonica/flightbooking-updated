package com.hexaware.flightbookingsystem.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hexaware.flightbookingsystem.entity.Client;
import com.hexaware.flightbookingsystem.repository.ClientRepository;

import javax.transaction.Transactional;
import java.util.Optional;

@Component
@Transactional
public class ClientDAO  {

    @Autowired
    private ClientRepository clientRepository;

    public Client create(Client client)
    {
       return clientRepository.save(client);
    }

    public Optional<Client> getCustomerByClientId(String clientId){
        return clientRepository.findById(clientId);
    }

    public Client update(Client client) {return clientRepository.save(client); }

}
