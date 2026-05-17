package com.meneses.hotelmanager.infrastructure.persistence.mappers;

import com.meneses.hotelmanager.infrastructure.persistence.embeddables.ContactInfoEmbeddable;
import com.meneses.hotelmanager.shared.valueobject.ContactInfo;

public class ContactInfoMapper {

    public static ContactInfoEmbeddable toEmbeddable(
            ContactInfo domain
    ) {

        if (domain == null) {
            return null;
        }

        return new ContactInfoEmbeddable(
                PhoneNumberMapper.toEmbeddable(domain.getPhoneNumber()),
                EmailMapper.toEmbeddable(domain.getEmail())
        );
    }

    public static ContactInfo toDomain(
            ContactInfoEmbeddable embeddable
    ) {

        if (embeddable == null) {
            return null;
        }

        return  new ContactInfo(
                PhoneNumberMapper.toDomain(embeddable.getPhoneNumber()),
                EmailMapper.toDomain(embeddable.getEmail())
        );
    }
}
