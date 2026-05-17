package com.meneses.hotelmanager.infrastructure.persistence.mappers;

import com.meneses.hotelmanager.infrastructure.persistence.embeddables.EmailEmbeddable;
import com.meneses.hotelmanager.shared.valueobject.Email;

public class EmailMapper {

    public static EmailEmbeddable toEmbeddable(
            Email domain
    ) {

        if (domain == null) {
            return null;
        }

        return  new EmailEmbeddable(
                domain.getValue()
        );
    }

    public static Email toDomain(
            EmailEmbeddable embeddable
    ) {

        if (embeddable == null) {
            return null;
        }

        return  new Email(
                embeddable.getValue()
        );
    }
}
