package com.meneses.hotelmanager.infrastructure.persistence.mappers;

import com.meneses.hotelmanager.domain.model.guest.Guest;
import com.meneses.hotelmanager.infrastructure.persistence.embeddables.*;
import com.meneses.hotelmanager.infrastructure.persistence.entities.GuestEntity;
import com.meneses.hotelmanager.shared.valueobject.*;

public class GuestMapper {

    public static GuestEntity toEntity(Guest domain) {
        if (domain == null) {
            return null;
        }
        return new GuestEntity(
                domain.getId(),
                PersonalInfoMapper.toEmbeddable(domain.getPersonalInfo()),
                ContactInfoMapper.toEmbeddable(domain.getContactInfo())
        );
    }

    public static Guest toDomain(GuestEntity entity){
        if (entity == null) {
            return null;
        }
        return  Guest.restore(
                entity.getId(),
                PersonalInfoMapper.toDomain(entity.getPersonalInfo()),
                ContactInfoMapper.toDomain(entity.getContactInfo())
        );
    }
}
