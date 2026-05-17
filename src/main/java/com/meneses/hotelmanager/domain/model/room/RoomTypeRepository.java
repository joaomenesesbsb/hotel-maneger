package com.meneses.hotelmanager.domain.model.room;

import java.util.Optional;
import java.util.UUID;

public interface RoomTypeRepository {
    Optional<RoomType> findById(UUID roomTypeId);

}
