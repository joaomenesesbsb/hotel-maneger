package com.meneses.hotelmanager.shared.valueobject;

import java.util.Objects;

public class PhoneNumber {
    private final String value;

    public PhoneNumber(String value) {

        Objects.requireNonNull(value);

        String normalized =
                value.replaceAll("[^0-9]", "");

        if (normalized.length() < 10
                || normalized.length() > 13) {

            throw new IllegalArgumentException(
                    "Invalid phone number."
            );
        }

        this.value = normalized;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value;
    }
}
