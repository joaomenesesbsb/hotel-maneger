package com.meneses.hotelmanager.infrastructure.persistence.repositories;

import com.meneses.hotelmanager.domain.model.reservation.Reservation;
import com.meneses.hotelmanager.domain.model.reservation.ReservationRepository;
import com.meneses.hotelmanager.infrastructure.persistence.SpringDataReservationRepository;
import com.meneses.hotelmanager.infrastructure.persistence.mappers.ReservationMapper;
import org.springframework.stereotype.Component;

@Component
public class PostgresReservationRepository implements ReservationRepository {

    private final SpringDataReservationRepository springDataRepository;

    public PostgresReservationRepository(SpringDataReservationRepository springDataRepository) {
        this.springDataRepository = springDataRepository;
    }

    @Override
    public void save(Reservation domain) {
        springDataRepository.save(ReservationMapper.toEntity(domain));
    }

}
