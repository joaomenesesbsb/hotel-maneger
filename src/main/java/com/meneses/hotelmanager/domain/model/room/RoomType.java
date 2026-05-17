package com.meneses.hotelmanager.domain.model.room;

import com.meneses.hotelmanager.shared.valueobject.Money;

import java.math.BigDecimal;
import java.util.UUID;

public class RoomType {
    private final UUID id;
    private String name;
    private String description;
    private Money dailyRate;

    public RoomType(
            UUID id,
            String name,
            String description,
            Money dailyRate
    ) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.dailyRate = dailyRate;
    }

    public static RoomType restore(
            UUID id,
            String name,
            String description,
            Money dailyRate
    ){
        return new RoomType(
                id,
                name,
                description,
                dailyRate
        );
    }

    public void updatePrice(Money newPrice){
        if (newPrice.isLessThanZero()) throw  new IllegalArgumentException("Invalid price.");
        this.dailyRate =newPrice;
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

    public Money getDailyRate() {
        return dailyRate;
    }
}
