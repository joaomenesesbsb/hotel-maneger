package com.meneses.hotelmanager.infrastructure.persistence.embeddables;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;
import lombok.NoArgsConstructor;

@Embeddable
@NoArgsConstructor
public class ContactInfoEmbeddable {

    @Embedded
    private PhoneNumberEmbeddable phoneNumber;
    @Embedded
    private EmailEmbeddable email;

    public ContactInfoEmbeddable(PhoneNumberEmbeddable phoneNumber, EmailEmbeddable email) {
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public PhoneNumberEmbeddable getPhoneNumber() {
        return phoneNumber;
    }

    public EmailEmbeddable getEmail() {
        return email;
    }
}
