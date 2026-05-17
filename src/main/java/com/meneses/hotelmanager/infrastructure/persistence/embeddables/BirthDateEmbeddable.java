package com.meneses.hotelmanager.infrastructure.persistence.embeddables;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Embeddable
@NoArgsConstructor
public class BirthDateEmbeddable {

    @Column(name = "birth_date")
    private LocalDate value;

    public BirthDateEmbeddable(LocalDate value) {
        this.value = value;
    }

    public LocalDate getValue() {
        return value;
    }
}
