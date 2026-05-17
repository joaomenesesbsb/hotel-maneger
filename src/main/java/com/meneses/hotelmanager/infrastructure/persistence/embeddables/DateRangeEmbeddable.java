package com.meneses.hotelmanager.infrastructure.persistence.embeddables;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@NoArgsConstructor
@Embeddable
public class DateRangeEmbeddable {

    @Column(name = "entry_date")
    private LocalDate entry;

    @Column(name = "departure_date")
    private LocalDate departure;

    public DateRangeEmbeddable(LocalDate entry, LocalDate departure) {
        this.entry = entry;
        this.departure = departure;
    }

    public LocalDate getEntry() {
        return entry;
    }

    public LocalDate getDeparture() {
        return departure;
    }
}
