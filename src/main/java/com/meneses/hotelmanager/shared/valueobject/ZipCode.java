package com.meneses.hotelmanager.shared.valueobject;

import java.util.Objects;

public class ZipCode {


    private final String value;

    public ZipCode(String value) {

        Objects.requireNonNull(value);

        String normalized =
                value.replaceAll("[^0-9]", "");

        if (normalized.length() != 8) {

            throw new IllegalArgumentException(
                    "Invalid zip code."
            );
        }

        this.value = normalized;
    }

    public String getValue() {
        return value;
    }

    public String getFormatted() {

        return value.substring(0, 5)
                + "-"
                + value.substring(5);
    }

    @Override
    public String toString() {
        return getFormatted();
    }
}
