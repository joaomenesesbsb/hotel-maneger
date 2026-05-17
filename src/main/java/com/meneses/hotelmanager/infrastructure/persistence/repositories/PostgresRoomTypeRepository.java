package com.meneses.hotelmanager.infrastructure.persistence.repositories;

import com.meneses.hotelmanager.domain.model.room.RoomType;
import com.meneses.hotelmanager.domain.model.room.RoomTypeRepository;
import com.meneses.hotelmanager.infrastructure.persistence.SpringDataRoomTypeRepository;
import com.meneses.hotelmanager.infrastructure.persistence.mappers.RoomTypeMapper;
import org.springframework.stereotype.Component;

import java.util.Optional;
import java.util.UUID;

@Component
public class PostgresRoomTypeRepository implements RoomTypeRepository {

    private final SpringDataRoomTypeRepository repository;

    public PostgresRoomTypeRepository(SpringDataRoomTypeRepository repository) {
        this.repository = repository;
    }

    @Override
    public Optional<RoomType> findById(UUID id) {
        return repository.findById(id).map(RoomTypeMapper::toDomain);
    }
}
