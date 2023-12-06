package com.example.bdd.model.northwind;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Shippers")
public class Shipper {
    @Id
    @Column(name = "ShipperID", nullable = false)
    private Integer id;

    @Column(name = "CompanyName", nullable = false, length = 50)
    private String companyName;

    @Column(name = "Phone", length = 50)
    private String phone;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

}