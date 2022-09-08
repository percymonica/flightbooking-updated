package com.hexaware.flightbookingsystem.entity;

import javax.persistence.*;

@Entity
@Table(name="company")
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long company_id;

    @Column(nullable = false)
    private String company_name;

    @Column(nullable = false)
    private String country;

    public Company() {
    }

    public Company(String company_name, String country) {
        this.company_name = company_name;
        this.country = country;
    }

    public Long getCompany_id() {
        return company_id;
    }

    public void setCompany_id(Long company_id) {
        this.company_id = company_id;
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
