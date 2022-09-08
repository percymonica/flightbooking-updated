package com.hexaware.flightbookingsystem.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.hexaware.flightbookingsystem.entity.Company;
import com.hexaware.flightbookingsystem.impl.CompanyServiceImpl;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/company")
public class CompanyController {

    @Autowired
    private CompanyServiceImpl companyService;

    @GetMapping
    public List<Company> getCompanies() {
        return companyService.getCompanies();
    }

    @PostMapping
    public Company createCompany(@RequestBody Company company){
        return companyService.createCompany(company);
    }

    @GetMapping(value = "/byId/{companyId}")
    public Optional<Company> findCompanyById(@PathVariable("companyId")Long companyId)
    {
        return companyService.findCompanyById(companyId);
    }

    @GetMapping(value = "/byName/{companyName}")
    public List<Company> findCompanyByName(@PathVariable("companyName")String companyName)
    {
        return companyService.findCompanyByName(companyName);
    }
}
