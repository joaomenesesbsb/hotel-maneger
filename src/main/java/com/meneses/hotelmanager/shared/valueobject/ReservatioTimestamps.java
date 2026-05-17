package com.meneses.hotelmanager.shared.valueobject;

import java.time.LocalDate;

public class ReservatioTimestamps {

    private final LocalDate requestDate;
    private LocalDate confirmationDate;

    public ReservatioTimestamps(LocalDate requestDate, LocalDate confirmationDate) {
        this.requestDate = requestDate;
        this.confirmationDate = confirmationDate;
    }

    public static ReservatioTimestamps create(){
        return new ReservatioTimestamps(LocalDate.now(),null);
    }

    public LocalDate getRequestDate() {
        return requestDate;
    }

    public LocalDate getConfirmationDate() {
        return confirmationDate;
    }
    public void addConfirmationDate() {
        this.confirmationDate = LocalDate.now();
    }
}
