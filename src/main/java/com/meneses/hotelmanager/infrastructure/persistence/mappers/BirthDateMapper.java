package com.meneses.hotelmanager.infrastructure.persistence.mappers;

import com.meneses.hotelmanager.infrastructure.persistence.embeddables.BirthDateEmbeddable;
import com.meneses.hotelmanager.shared.valueobject.BirthDate;

public class BirthDateMapper {

    public static BirthDateEmbeddable toEmbeddable(BirthDate domain){
        if (domain == null) {
            return null;
        }

        return new BirthDateEmbeddable(
                domain.getValue()
        );
    }

    public static BirthDate toDomain(BirthDateEmbeddable embeddable){
        if (embeddable == null) {
            return null;
        }

        return new BirthDate(
                embeddable.getValue()
        );
    }
}
