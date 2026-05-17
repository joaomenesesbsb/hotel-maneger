package com.meneses.hotelmanager.infrastructure.persistence.mappers;

import com.meneses.hotelmanager.infrastructure.persistence.embeddables.DateRangeEmbeddable;
import com.meneses.hotelmanager.shared.valueobject.DateRange;

public class DateRangeMapper {

    public static DateRangeEmbeddable toEmbeddable(
            DateRange domain
    ) {

        if (domain == null) {
            return null;
        }

        return  new DateRangeEmbeddable(
                domain.getEntry(),
                domain.getDeparture()
        );
    }

    public static DateRange toDomain(
            DateRangeEmbeddable embeddable
    ) {

        if (embeddable == null) {
            return null;
        }

        return  new DateRange(
                embeddable.getEntry(),
                embeddable.getDeparture()
        );
    }
}
