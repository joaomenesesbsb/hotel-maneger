package com.meneses.hotelmanager.infrastructure.persistence.embeddables;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;
import lombok.NoArgsConstructor;

@Embeddable
@NoArgsConstructor
public class AddressEmbeddable {

    @Column(name = "street")
    private String street;
    @Column(name = "number")
    private String number;
    @Column(name = "neighborhood")
    private String neighborhood;
    @Column(name = "city")
    private String city;
    @Column(name = "state")
    private String state;
    @Embedded
    private ZipCodeEmbeddable zipCode;
    @Column(name = "count")
    private String country;

    public AddressEmbeddable(
            String street,
            String number,
            String neighborhood,
            String city,
            String state,
            ZipCodeEmbeddable zipCode,
            String country) {
        this.street = street;
        this.number = number;
        this.neighborhood = neighborhood;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.country = country;
    }

    public String getStreet() {
        return street;
    }

    public String getNumber() {
        return number;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public ZipCodeEmbeddable getZipCode() {
        return zipCode;
    }

    public String getCountry() {
        return country;
    }
}
