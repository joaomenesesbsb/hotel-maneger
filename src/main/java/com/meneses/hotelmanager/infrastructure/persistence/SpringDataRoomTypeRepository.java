package com.meneses.hotelmanager.infrastructure.persistence;

import com.meneses.hotelmanager.infrastructure.persistence.entities.RoomTypeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface SpringDataRoomTypeRepository extends JpaRepository<RoomTypeEntity, UUID> {
}
