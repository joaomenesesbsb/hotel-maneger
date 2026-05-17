package com.meneses.hotelmanager.infrastructure.persistence.mappers;

import com.meneses.hotelmanager.infrastructure.persistence.embeddables.MoneyEmbeddable;
import com.meneses.hotelmanager.shared.valueobject.Money;

public class MoneyMapper {

    public static MoneyEmbeddable toEmbeddable(
            Money domain
    ) {

        if (domain == null) {
            return null;
        }

        return  new MoneyEmbeddable(
                domain.getAmount()
        );
    }

    public static Money toDomain(
            MoneyEmbeddable embeddable
    ) {

        if (embeddable == null) {
            return null;
        }

        return  new Money(
                embeddable.getAmount()
        );
    }
}
