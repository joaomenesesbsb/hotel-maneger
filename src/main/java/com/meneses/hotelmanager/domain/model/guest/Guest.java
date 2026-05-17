package com.meneses.hotelmanager.domain.model.guest;

import com.meneses.hotelmanager.domain.model.reservation.Reservation;
import com.meneses.hotelmanager.shared.valueobject.*;

import java.util.*;

public class Guest {

    private final UUID id;
    private PersonalInfo personalInfo;
    private ContactInfo contactInfo;


    public Guest(
            UUID id,
            PersonalInfo personalInfo,
            ContactInfo contactInfo
    ) {
        this.id = id;
        this.personalInfo = personalInfo;
        this.contactInfo = contactInfo;
    }

    public static Guest create(
             PersonalInfo personalInfo,
             ContactInfo contactInfo
    ) {
        return new Guest(
                UUID.randomUUID(),
                personalInfo,
                contactInfo
        );
    }

    public static Guest restore (
            UUID id,
            PersonalInfo personalInfo,
            ContactInfo contactInfo
    ) {
        return new Guest(
                id,
                personalInfo,
                contactInfo
        );
    }

    public void changeAddress(Address newAddress) {
        this.personalInfo.changeAddress(newAddress);
    }
    public void changePhone(PhoneNumber newPhoneNumber) {
        this.contactInfo.changePhone(newPhoneNumber);
    }
    public void changeEmail(Email newEmail) {
        this.contactInfo.changeEmail(newEmail);
    }

    public UUID getId() {
        return id;
    }

    public PersonalInfo getPersonalInfo() {
        return personalInfo;
    }

    public ContactInfo getContactInfo() {
        return contactInfo;
    }

}
