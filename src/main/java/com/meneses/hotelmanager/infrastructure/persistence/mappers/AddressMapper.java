package com.meneses.hotelmanager.infrastructure.persistence.mappers;

import com.meneses.hotelmanager.infrastructure.persistence.embeddables.AddressEmbeddable;
import com.meneses.hotelmanager.shared.valueobject.Address;

public class AddressMapper {

    public static AddressEmbeddable toEmbeddable(
            Address domain
    ) {

        if (domain == null) {
            return null;
        }

        return new AddressEmbeddable(
                domain.getStreet(),
                domain.getNumber(),
                domain.getNeighborhood(),
                domain.getCity(),
                domain.getState(),
                ZipCodeMapper.toEmbeddable(
                        domain.getZipCode()
                ),
                domain.getCountry()
        );
    }

    public static Address toDomain(
            AddressEmbeddable embeddable
    ) {
        if (embeddable == null) {
            return null;
        }

        return new Address(
                embeddable.getStreet(),
                embeddable.getNumber(),
                embeddable.getNeighborhood(),
                embeddable.getCity(),
                embeddable.getState(),
                ZipCodeMapper.toDomain(
                        embeddable.getZipCode()
                ),
                embeddable.getCountry()
        );
    }


}
