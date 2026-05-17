package com.meneses.hotelmanager.infrastructure.persistence.mappers;

import com.meneses.hotelmanager.infrastructure.persistence.embeddables.ZipCodeEmbeddable;
import com.meneses.hotelmanager.shared.valueobject.ZipCode;

public class ZipCodeMapper {

    public static ZipCodeEmbeddable toEmbeddable(
            ZipCode domain
    ) {

        if (domain == null) {
            return null;
        }

        return  new ZipCodeEmbeddable(
                domain.getValue()
        );
    }

    public static ZipCode toDomain(
            ZipCodeEmbeddable embeddable
    ) {

        if (embeddable == null) {
            return null;
        }

        return  new ZipCode(
                embeddable.getValue()
        );
    }
}
