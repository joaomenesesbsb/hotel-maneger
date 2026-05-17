package com.meneses.hotelmanager.infrastructure.persistence.entities;

import com.meneses.hotelmanager.infrastructure.persistence.embeddables.ContactInfoEmbeddable;
import com.meneses.hotelmanager.infrastructure.persistence.embeddables.PersonalInfoEmbeddable;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@NoArgsConstructor
@Table(name = "guest")
public class GuestEntity {

    @Id
    private UUID id;

    @Embedded
    private PersonalInfoEmbeddable personalInfo;

    private ContactInfoEmbeddable contactInfo;

    public GuestEntity(
            UUID id,
            PersonalInfoEmbeddable personalInfo,
            ContactInfoEmbeddable contactInfo) {
        this.id = id;
        this.personalInfo = personalInfo;
        this.contactInfo = contactInfo;
    }

    public UUID getId() {
        return id;
    }

    public PersonalInfoEmbeddable getPersonalInfo() {
        return personalInfo;
    }

    public ContactInfoEmbeddable getContactInfo() {
        return contactInfo;
    }
}
