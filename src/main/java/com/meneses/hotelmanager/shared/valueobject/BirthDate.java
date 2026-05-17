package com.meneses.hotelmanager.shared.valueobject;

import java.time.LocalDate;
import java.time.Period;
import java.util.Objects;

public class BirthDate {


    private final LocalDate value;

    public BirthDate(LocalDate value) {

        Objects.requireNonNull(value);

        if (value.isAfter(LocalDate.now())) {
            throw new IllegalArgumentException(
                    "Birth date cannot be in the future."
            );
        }

        this.value = value;
    }

    public LocalDate getValue() {
        return value;
    }

    public int getAge() {
        return Period.between(
                value,
                LocalDate.now()
        ).getYears();
    }

    public boolean isAdult() {
        return getAge() >= 18;
    }

    @Override
    public String toString() {
        return value.toString();
    }
}
