package com.meneses.hotelmanager.infrastructure.persistence.mappers;

import com.meneses.hotelmanager.infrastructure.persistence.embeddables.PhoneNumberEmbeddable;
import com.meneses.hotelmanager.shared.valueobject.PhoneNumber;

public class PhoneNumberMapper {

    public static PhoneNumberEmbeddable toEmbeddable(
        PhoneNumber domain
) {

    if (domain == null) {
        return null;
    }

    return  new PhoneNumberEmbeddable(
            domain.getValue()
    );
}

    public static PhoneNumber toDomain(
            PhoneNumberEmbeddable embeddable
    ) {

        if (embeddable == null) {
            return null;
        }

        return  new PhoneNumber(
                embeddable.getValue()
        );
    }
}
