package com.meneses.hotelmanager.infrastructure.persistence.embeddables;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.NoArgsConstructor;

@Embeddable
@NoArgsConstructor
public class ZipCodeEmbeddable {

    @Column(name = "zip_code")
    private String value;

    public ZipCodeEmbeddable(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
