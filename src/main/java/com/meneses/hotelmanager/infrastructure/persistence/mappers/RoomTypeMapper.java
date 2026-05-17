package com.meneses.hotelmanager.infrastructure.persistence.mappers;

import com.meneses.hotelmanager.domain.model.room.RoomType;
import com.meneses.hotelmanager.infrastructure.persistence.entities.RoomTypeEntity;

public class RoomTypeMapper {

    public static RoomTypeEntity toEntity(RoomType domain) {
        if (domain == null) {
            return null;
        }
        return new RoomTypeEntity(
                domain.getId(),
                domain.getName(),
                domain.getDescription(),
                MoneyMapper.toEmbeddable(domain.getDailyRate())
        );
    }
    public static RoomType toDomain(RoomTypeEntity entity) {
        if (entity == null) {
            return null;
        }
        return RoomType.restore(
                entity.getId(),
                entity.getName(),
                entity.getDescription(),
                MoneyMapper.toDomain(entity.getDailyRate())
        );
    }
}
