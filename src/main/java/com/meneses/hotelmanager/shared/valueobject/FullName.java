package com.meneses.hotelmanager.shared.valueobject;

import java.util.Objects;

public class FullName {
    private final String firstName;
    private final String lastName;

    public FullName(String firstName, String lastName) {

        validate(firstName, lastName);

        this.firstName = firstName.trim();
        this.lastName = lastName.trim();
    }

    private void validate(String firstName, String lastName) {

        Objects.requireNonNull(firstName);
        Objects.requireNonNull(lastName);

        if (firstName.isBlank()) {
            throw new IllegalArgumentException(
                    "First name cannot be empty."
            );
        }

        if (lastName.isBlank()) {
            throw new IllegalArgumentException(
                    "Last name cannot be empty."
            );
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCompleteName() {
        return firstName + " " + lastName;
    }

    @Override
    public String toString() {
        return getCompleteName();
    }
}
