package com.hexaware.flightbookingsystem.entity;

import javax.persistence.*;

@Entity
@Table(name="client")
public class Client {
    @Id
    private String id_number;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String surname;
    @Column
    private String phone;
    @Column
    private String nationality;

    public String getId_number() {
        return id_number;
    }

    public void setId_number(String id_number) {
        this.id_number = id_number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

}
