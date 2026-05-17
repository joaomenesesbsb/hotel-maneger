package com.meneses.hotelmanager.shared.valueobject;

public class PersonalInfo {

    private FullName fullName;
    private Document document;
    private BirthDate birthDate;
    private Address address;

    public PersonalInfo(
            FullName fullName,
            Document document,
            BirthDate birthDate,
            Address address) {
        this.fullName = fullName;
        this.document = document;
        this.birthDate = birthDate;
        this.address = address;
    }

    public void changeAddress(Address newAddress) {
        this.address = newAddress;
    }

    public FullName getFullName() {
        return fullName;
    }
    public Document getDocument() {
        return document;
    }

    public BirthDate getBirthDate() {
        return birthDate;
    }

    public Address getAddress() {
        return address;
    }
}
