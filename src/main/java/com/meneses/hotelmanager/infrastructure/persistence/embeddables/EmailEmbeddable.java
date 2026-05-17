package com.meneses.hotelmanager.infrastructure.persistence.embeddables;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.NoArgsConstructor;

@Embeddable
@NoArgsConstructor
public class EmailEmbeddable {

    @Column(name = "email")
    private String value;

    public EmailEmbeddable(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
