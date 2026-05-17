package com.meneses.hotelmanager.infrastructure.persistence.mappers;

import com.meneses.hotelmanager.infrastructure.persistence.embeddables.PersonalInfoEmbeddable;
import com.meneses.hotelmanager.shared.valueobject.PersonalInfo;

public class PersonalInfoMapper {

    public static PersonalInfoEmbeddable toEmbeddable(
            PersonalInfo domain
    ) {

        if (domain == null) {
            return null;
        }

        return  new PersonalInfoEmbeddable(
                FullNameMapper.toEmbeddable(domain.getFullName()),
                DocumentMapper.toEmbeddable(domain.getDocument()),
                BirthDateMapper.toEmbeddable(domain.getBirthDate()),
                AddressMapper.toEmbeddable(domain.getAddress())
        );
    }

    public static PersonalInfo toDomain(
            PersonalInfoEmbeddable embeddable
    ) {

        if (embeddable == null) {
            return null;
        }

        return  new PersonalInfo(
                FullNameMapper.toDomain(embeddable.getFullName()),
                DocumentMapper.toDomain(embeddable.getDocument()),
                BirthDateMapper.toDomain(embeddable.getBirthDate()),
                AddressMapper.toDomain(embeddable.getAddress())
        );
    }
}
