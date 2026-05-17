package com.meneses.hotelmanager.infrastructure.persistence.embeddables;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;
import lombok.NoArgsConstructor;

@Embeddable
@NoArgsConstructor
public class PersonalInfoEmbeddable {

    @Embedded
    private FullNameEmbeddable fullName;
    @Embedded
    private DocumentEmbeddable document;
    @Embedded
    private BirthDateEmbeddable birthDate;
    @Embedded
    private AddressEmbeddable address;

    public PersonalInfoEmbeddable(
            FullNameEmbeddable fullName,
            DocumentEmbeddable document,
            BirthDateEmbeddable birthDate,
            AddressEmbeddable address) {
        this.fullName = fullName;
        this.document = document;
        this.birthDate = birthDate;
        this.address = address;
    }

    public FullNameEmbeddable getFullName() {
        return fullName;
    }

    public DocumentEmbeddable getDocument() {
        return document;
    }

    public BirthDateEmbeddable getBirthDate() {
        return birthDate;
    }

    public AddressEmbeddable getAddress() {
        return address;
    }
}
