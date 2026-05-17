package com.meneses.hotelmanager.infrastructure.persistence.embeddables;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.NoArgsConstructor;

@Embeddable
@NoArgsConstructor
public class PhoneNumberEmbeddable {

    @Column(name = "phone_number")
    private String value;

    public PhoneNumberEmbeddable(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
