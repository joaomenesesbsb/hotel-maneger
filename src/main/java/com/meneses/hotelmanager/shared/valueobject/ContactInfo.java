package com.meneses.hotelmanager.shared.valueobject;

public class ContactInfo {
    private PhoneNumber phoneNumber;
    private Email email;

    public ContactInfo(PhoneNumber phoneNumber, Email email) {
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public void changePhone(PhoneNumber newPhoneNumber) {
        this.phoneNumber = newPhoneNumber;
    }

    public void changeEmail(Email newEmail) {
        this.email = newEmail;
    }

    public PhoneNumber getPhoneNumber() {
        return phoneNumber;
    }

    public Email getEmail() {
        return email;
    }
}
