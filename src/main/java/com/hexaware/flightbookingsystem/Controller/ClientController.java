package com.hexaware.flightbookingsystem.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.hexaware.flightbookingsystem.entity.Client;
import com.hexaware.flightbookingsystem.impl.ClientServiceImpl;

@RestController
@RequestMapping("/client")
public class ClientController {

    @Autowired
    private ClientServiceImpl clientService;

    @PostMapping
    public Client createClient(@RequestBody Client client){
        return clientService.createClient(client);
    }

}
