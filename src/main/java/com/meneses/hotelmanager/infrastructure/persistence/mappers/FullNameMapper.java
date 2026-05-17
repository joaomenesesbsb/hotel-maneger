package com.meneses.hotelmanager.infrastructure.persistence.mappers;

import com.meneses.hotelmanager.infrastructure.persistence.embeddables.FullNameEmbeddable;
import com.meneses.hotelmanager.shared.valueobject.FullName;

public class FullNameMapper {

    public static FullName toDomain(
            FullNameEmbeddable embeddable
    ) {

        return new FullName(
                embeddable.getFirstName(),
                embeddable.getLastName()
        );
    }

    public static FullNameEmbeddable toEmbeddable(
            FullName domain
    ) {

        return new FullNameEmbeddable(
                domain.getFirstName(),
                domain.getLastName()
        );
    }
}
