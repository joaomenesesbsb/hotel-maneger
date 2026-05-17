package com.meneses.hotelmanager.shared.valueobject;

import java.util.Objects;

public class Address {

    private final String street;
    private final String number;
    private final String neighborhood;
    private final String city;
    private final String state;
    private final ZipCode zipCode;
    private final String country;

    public Address(
            String street,
            String number,
            String neighborhood,
            String city,
            String state,
            ZipCode zipCode,
            String country
    ) {

        validate(
                street,
                number,
                neighborhood,
                city,
                state,
                zipCode,
                country
        );

        this.street = street.trim();
        this.number = number.trim();
        this.neighborhood = neighborhood.trim();
        this.city = city.trim();
        this.state = state.trim();
        this.zipCode = zipCode;
        this.country = country.trim();
    }

    private void validate(
            String street,
            String number,
            String neighborhood,
            String city,
            String state,
            ZipCode zipCode,
            String country
    ) {

        Objects.requireNonNull(street);
        Objects.requireNonNull(number);
        Objects.requireNonNull(neighborhood);
        Objects.requireNonNull(city);
        Objects.requireNonNull(state);
        Objects.requireNonNull(zipCode);
        Objects.requireNonNull(country);

        if (street.isBlank()
                || city.isBlank()
                || state.isBlank()) {

            throw new IllegalArgumentException(
                    "Invalid address."
            );
        }
    }

    private String normalizeZipCode(String zipCode) {

        return zipCode.replaceAll("[^0-9]", "");
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

    public ZipCode getZipCode() {
        return zipCode;
    }

    public String getZipCodeValue() {
        return zipCode.getValue();
    }
    public String getZipCodeFormatted() {
        return zipCode.getFormatted();
    }

    public String getCountry() {
        return country;
    }

    public String getCompleteAddress() {

        return street + ", "
                + number + " - "
                + neighborhood + ", "
                + city + " - "
                + state + ", "
                + zipCode + ", "
                + country;
    }

    @Override
    public String toString() {
        return getCompleteAddress();
    }
}
