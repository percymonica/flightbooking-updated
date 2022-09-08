package com.hexaware.flightbookingsystem.service;

import java.util.List;
import java.util.Optional;

import com.hexaware.flightbookingsystem.entity.Company;

public interface CompanyService {

  public List<Company> getCompanies();
  public Company createCompany(Company company);
  public Optional<Company> findCompanyById(Long id);
  public List<Company> findCompanyByName(String companyName);
}
