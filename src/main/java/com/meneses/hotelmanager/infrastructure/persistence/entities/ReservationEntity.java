package com.meneses.hotelmanager.infrastructure.persistence.entities;

import com.meneses.hotelmanager.domain.model.reservation.ReservationStatus;
import com.meneses.hotelmanager.infrastructure.persistence.embeddables.DateRangeEmbeddable;
import com.meneses.hotelmanager.infrastructure.persistence.embeddables.MoneyEmbeddable;
import com.meneses.hotelmanager.infrastructure.persistence.embeddables.ReservationTimeStampsEmbeddable;
import jakarta.persistence.*;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@NoArgsConstructor
@Table(name = "reservation")
public class ReservationEntity {

    @Id
    private UUID id;

    @Embedded
    private DateRangeEmbeddable period;

    @Enumerated(EnumType.STRING)
    private ReservationStatus status;

    @ManyToOne
    @JoinColumn(name = "room_type_id")
    private RoomTypeEntity roomType;

    @Embedded
    private ReservationTimeStampsEmbeddable timeStamps;

    @Column(name = "number_of_guests")
    private Integer numberOfGuests;

    @Embedded
    private MoneyEmbeddable reservedDailyRate;

    @Column(name = "guest_id")
    private UUID guestId;

    public ReservationEntity(
            UUID id,
            DateRangeEmbeddable period,
            ReservationStatus status,
            RoomTypeEntity roomType,
            ReservationTimeStampsEmbeddable timeStamps,
            Integer numberOfGuests,
            MoneyEmbeddable reservedDailyRate,
            UUID guestId) {
        this.id = id;
        this.period = period;
        this.status = status;
        this.roomType = roomType;
        this.timeStamps = timeStamps;
        this.numberOfGuests = numberOfGuests;
        this.reservedDailyRate = reservedDailyRate;
        this.guestId = guestId;
    }

    public UUID getId() {
        return id;
    }

    public DateRangeEmbeddable getPeriod() {
        return period;
    }
    public LocalDate getEntryDate() {
        return period.getEntry();
    }
    public LocalDate getDepartureDate() {
        return period.getDeparture();
    }

    public ReservationStatus getStatus() {
        return status;
    }

    public RoomTypeEntity getRoomType() {
        return roomType;
    }

    public ReservationTimeStampsEmbeddable getTimeStamps() {
        return timeStamps;
    }
    public LocalDate getRequestDate() {
        return timeStamps.getRequestDate();
    }
    public LocalDate getConfirmationDate() {
        return timeStamps.getConfirmationDate();
    }

    public Integer getNumberOfGuests() {
        return numberOfGuests;
    }

    public MoneyEmbeddable getReservedDailyRate() {
        return reservedDailyRate;
    }
    public BigDecimal getAmount() {
        return reservedDailyRate.getAmount();
    }

    public UUID getGuestId() {
        return guestId;
    }
}
