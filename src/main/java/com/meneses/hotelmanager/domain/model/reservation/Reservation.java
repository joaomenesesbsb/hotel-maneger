package com.meneses.hotelmanager.domain.model.reservation;

import com.meneses.hotelmanager.domain.model.guest.Guest;
import com.meneses.hotelmanager.domain.model.room.RoomType;
import com.meneses.hotelmanager.shared.valueobject.DateRange;
import com.meneses.hotelmanager.shared.valueobject.Money;
import com.meneses.hotelmanager.shared.valueobject.ReservatioTimestamps;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.UUID;

public class Reservation {
    private final UUID id;
    private DateRange period;
    private ReservationStatus status;
    private RoomType roomType;
    private ReservatioTimestamps timestamps;
    private Integer numberOfGuests;
    private Money reservedDailyRate;
    private UUID guestId;

    public Reservation(
            UUID id,
            DateRange period,
            ReservationStatus status,
            RoomType roomType,
            ReservatioTimestamps timestamps,
            Integer numberOfGuests,
            Money reservedDailyRate,
            UUID guestId
    ) {
        this.id = id;
        this.period = period;
        this.status = status;
        this.roomType = roomType;
        this.timestamps = timestamps;
        this.numberOfGuests = numberOfGuests;
        this.reservedDailyRate = reservedDailyRate;
        this.guestId = guestId;
    }

    public static Reservation create(
            DateRange period,
            RoomType roomType,
            Integer numberOfGuests,
            UUID guestId) {

        ReservatioTimestamps timeStamps = ReservatioTimestamps.create();
        Reservation reservation =
                new Reservation(
                        UUID.randomUUID(),
                        period,
                        ReservationStatus.REQUESTED,
                        roomType,
                        timeStamps,
                        numberOfGuests,
                        Money.zero(),
                        guestId);
        reservation.reservedDailyRate = reservation.calculateTotal();

        return reservation;
    }

    public static Reservation restore(
            UUID id,
            DateRange period,
            ReservationStatus status,
            RoomType roomType,
            ReservatioTimestamps timestamps,
            Integer numberOfGuests,
            Money reservedDailyRate,
            UUID guestId
    ) {
        return new Reservation(
                id,
                period,
                status,
                roomType,
                timestamps,
                numberOfGuests,
                reservedDailyRate,
                guestId
        );
    }

    public void reschedule(DateRange newPeriod) {
        if (this.status == ReservationStatus.CONFIRMED) {
            throw new IllegalStateException(
                    "Cannot reschedule a confirmed reservation."
            );
        }
        this.period = newPeriod;
    }

    public void confirm() {
        if (status != ReservationStatus.REQUESTED) {
            throw new IllegalStateException(
                    "Reservation cannot to e confirmed!"
            );
        }
        this.status = ReservationStatus.CONFIRMED;
        this.timestamps.addConfirmationDate();
    }

    public void cancel(){
        if (status != ReservationStatus.CANCELED) {
            throw new IllegalStateException(
                    "Reservation cannot to e confirmed!"
            );
        }
        this.status = ReservationStatus.CANCELED;
    }

    public Money calculateTotal() {

        long days = ChronoUnit.DAYS.between(period.getEntry(), period.getDeparture());

        if (days <= 0) days = 1;
        return reservedDailyRate.multiply(Math.toIntExact(days));
    }

    public UUID getId() {
        return id;
    }
    public DateRange getPeriod() {
        return period;
    }
    public LocalDate getEntry(){
        return period.getEntry();
    }
    public LocalDate getDeparture(){
        return period.getDeparture();
    }
    public ReservationStatus getStatus() {
        return status;
    }
    public RoomType getRoomType() {
        return roomType;
    }
    public ReservatioTimestamps getTimestamps() {
        return timestamps;
    }
    public LocalDate getRequestDate() {
        return timestamps.getRequestDate();
    }
    public LocalDate getConfirmationDate() {
        return timestamps.getConfirmationDate();
    }
    public Integer getNumberOfGuests() {
        return numberOfGuests;
    }
    public Money getReservedDailyRate() {
        return reservedDailyRate;
    }
    public BigDecimal getReservedDailyRateBigDecimal() {
        return reservedDailyRate.getAmount();
    }

    public UUID getGuestId() {
        return guestId;
    }
}
