package com.hexaware.flightbookingsystem.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.flightbookingsystem.DAO.CompanyDAO;
import com.hexaware.flightbookingsystem.entity.Company;
import com.hexaware.flightbookingsystem.service.CompanyService;

import java.util.List;
import java.util.Optional;

@Service
public class CompanyServiceImpl implements CompanyService {

    @Autowired
    private CompanyDAO companyDAO;

    @Override
    public List<Company> getCompanies(){
        return companyDAO.getCompanies();
    }

    @Override
    public Company createCompany(Company company){
        return companyDAO.create(company);
    }

    @Override
    public Optional<Company> findCompanyById(Long id) {
        return companyDAO.findById(id);
    }

    @Override
    public List<Company> findCompanyByName(String companyName) {
        return companyDAO.findByName(companyName);
    }
}
