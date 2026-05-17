package com.meneses.hotelmanager.infrastructure.persistence.mappers;

import com.meneses.hotelmanager.infrastructure.persistence.embeddables.ReservationTimeStampsEmbeddable;
import com.meneses.hotelmanager.shared.valueobject.ReservatioTimestamps;

public class ReservationTimeStampsMapper {

    public static ReservationTimeStampsEmbeddable toEmbeddable(
            ReservatioTimestamps domain
    ) {

        if (domain == null) {
            return null;
        }

        return  new ReservationTimeStampsEmbeddable(
                domain.getRequestDate(),
                domain.getConfirmationDate()
        );
    }

    public static ReservatioTimestamps toDomain(
            ReservationTimeStampsEmbeddable embeddable
    ) {

        if (embeddable == null) {
            return null;
        }

        return  new ReservatioTimestamps(
                embeddable.getRequestDate(),
                embeddable.getConfirmationDate()
        );
    }
}
