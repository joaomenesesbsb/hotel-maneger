package com.meneses.hotelmanager.infrastructure.persistence.mappers;

import com.meneses.hotelmanager.domain.model.reservation.Reservation;
import com.meneses.hotelmanager.infrastructure.persistence.entities.ReservationEntity;

public class ReservationMapper {

    public static ReservationEntity toEntity(Reservation domain) {
        if (domain == null) {
            return null;
        }

        return new ReservationEntity(
                domain.getId(),
                DateRangeMapper.toEmbeddable(domain.getPeriod()),
                domain.getStatus(),
                RoomTypeMapper.toEntity(domain.getRoomType()),
                ReservationTimeStampsMapper.toEmbeddable(domain.getTimestamps()),
                domain.getNumberOfGuests(),
                MoneyMapper.toEmbeddable(domain.getReservedDailyRate()),
                domain.getGuestId()
        );
    }

    public static Reservation toDomain(ReservationEntity entity) {
        if (entity == null) {
            return null;
        }
        return Reservation.restore(
                entity.getId(),
                DateRangeMapper.toDomain(entity.getPeriod()),
                entity.getStatus(),
                RoomTypeMapper.toDomain(entity.getRoomType()),
                ReservationTimeStampsMapper.toDomain(entity.getTimeStamps()),
                entity.getNumberOfGuests(),
                MoneyMapper.toDomain(entity.getReservedDailyRate()),
                entity.getGuestId()
        );
    }
}
