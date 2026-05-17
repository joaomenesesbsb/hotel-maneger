package com.meneses.hotelmanager.infrastructure.persistence.embeddables;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.NoArgsConstructor;

@Embeddable
@NoArgsConstructor
public class DocumentEmbeddable {

    @Column(name = "document")
    private String value;

    public DocumentEmbeddable(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
