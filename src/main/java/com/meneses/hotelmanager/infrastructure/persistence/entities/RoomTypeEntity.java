package com.meneses.hotelmanager.infrastructure.persistence.entities;

import com.meneses.hotelmanager.infrastructure.persistence.embeddables.MoneyEmbeddable;
import jakarta.persistence.*;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@NoArgsConstructor
@Table(name = "room_type")
public class RoomTypeEntity {

    @Id
    private UUID id;

    @Column(name = "type_name")
    private String name;

    @Column(name = "description")
    private String description;

    @Embedded
    private MoneyEmbeddable dailyRate;

    @OneToMany(mappedBy = "roomType")
    private List<ReservationEntity> reservationEntities = new ArrayList<>();

    public RoomTypeEntity(
            UUID id,
            String name,
            String description,
            MoneyEmbeddable dailyRate) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.dailyRate = dailyRate;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public MoneyEmbeddable getDailyRate() {
        return dailyRate;
    }

    public BigDecimal getAmount() {
        return dailyRate.getAmount();
    }

    public List<ReservationEntity> getReservationEntities() {
        return reservationEntities;
    }
}
