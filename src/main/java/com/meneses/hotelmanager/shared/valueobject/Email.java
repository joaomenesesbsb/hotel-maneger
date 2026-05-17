package com.meneses.hotelmanager.shared.valueobject;

import java.util.Objects;

public class Email {
    private final String value;

    public Email(String value) {

        Objects.requireNonNull(value);

        String normalized = value.trim().toLowerCase();

        if (!normalized.matches("^[A-Za-z0-9+_.-]+@(.+)$")) {
            throw new IllegalArgumentException(
                    "Invalid email."
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
