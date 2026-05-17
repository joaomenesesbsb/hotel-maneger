package com.meneses.hotelmanager.infrastructure.persistence.embeddables;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@NoArgsConstructor
@Embeddable
public class ReservationTimeStampsEmbeddable {

    @Column(name = "request_date")
    private LocalDate requestDate;
    @Column(name = "confirmation_date")
    private LocalDate confirmationDate;

    public ReservationTimeStampsEmbeddable(LocalDate requestDate, LocalDate confirmationDate) {
        this.requestDate = requestDate;
        this.confirmationDate = confirmationDate;
    }

    public LocalDate getRequestDate() {
        return requestDate;
    }

    public LocalDate getConfirmationDate() {
        return confirmationDate;
    }
}
