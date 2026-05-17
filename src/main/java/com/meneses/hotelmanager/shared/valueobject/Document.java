package com.meneses.hotelmanager.shared.valueobject;

import java.util.Objects;

public class Document {


    private final String value;

    public Document(String value) {

        Objects.requireNonNull(value);

        String normalized =
                value.replaceAll("[^0-9]", "");

        if (normalized.length() != 11) {

            throw new IllegalArgumentException(
                    "Invalid CPF."
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
