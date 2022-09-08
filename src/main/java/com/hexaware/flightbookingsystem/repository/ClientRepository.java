package com.hexaware.flightbookingsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hexaware.flightbookingsystem.entity.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client,String> {
}
