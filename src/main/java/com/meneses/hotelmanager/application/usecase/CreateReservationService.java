package com.meneses.hotelmanager.application.usecase;

import com.meneses.hotelmanager.application.dto.CreateReservationRequest;
import com.meneses.hotelmanager.domain.model.reservation.Reservation;
import com.meneses.hotelmanager.domain.model.reservation.ReservationRepository;
import com.meneses.hotelmanager.domain.model.room.RoomType;
import com.meneses.hotelmanager.domain.model.room.RoomTypeRepository;
import com.meneses.hotelmanager.shared.valueobject.DateRange;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CreateReservationService {

    private final ReservationRepository reservationRepository;
    private final RoomTypeRepository roomTypeRepository;

    public CreateReservationService(ReservationRepository reservationRepository, RoomTypeRepository roomTypeRepository) {
        this.reservationRepository = reservationRepository;
        this.roomTypeRepository = roomTypeRepository;
    }

    /*
    public void execute(CreateReservationRequest request) {
        RoomType roomType = roomTypeRepository.findById(request.getRoomTypeId())
                .orElseThrow(() ->
                        new EntityNotFoundException("Room type not found"));


        reservationRepository.save(reservation);
    }*/

}
