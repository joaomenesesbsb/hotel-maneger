package com.meneses.hotelmanager.shared.valueobject;

import java.time.LocalDate;
import java.util.Objects;


public final class DateRange {
    private final LocalDate entry;
    private final LocalDate departure;

    public DateRange(LocalDate entry, LocalDate departure) {
        validateDate(entry,departure);
        this.entry = entry;
        this.departure = departure;
    }

    private void validateDate(LocalDate entry, LocalDate departure) {
        if (entry == null || departure == null) {
            throw  new IllegalArgumentException("The dates cannot be null.");
        }
        if (entry.isAfter(departure)) {
            throw new IllegalArgumentException("The check-in date must be earlier than the check-out date.");
        }
    }

    public LocalDate getEntry() {
        return entry;
    }

    public LocalDate getDeparture() {
        return departure;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        DateRange dataRange = (DateRange) o;
        return Objects.equals(entry, dataRange.entry) && Objects.equals(departure, dataRange.departure);
    }

    @Override
    public int hashCode() {
        return Objects.hash(entry, departure);
    }
}
