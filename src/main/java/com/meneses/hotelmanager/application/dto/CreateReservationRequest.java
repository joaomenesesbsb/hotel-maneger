package com.meneses.hotelmanager.application.dto;

import com.meneses.hotelmanager.domain.model.guest.Guest;
import com.meneses.hotelmanager.shared.valueobject.DateRange;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.apache.logging.log4j.core.config.plugins.validation.constraints.NotBlank;

import java.time.LocalDate;
import java.util.UUID;

@Getter
@NoArgsConstructor
public class CreateReservationRequest {

    @NotBlank(message = "ID of room type not found")
    private UUID roomTypeId;

    @NotBlank(message = "Period not found")
    private DateRange period;

    @NotBlank(message = "Number of guest not empty")
    private Integer numberOfGuest;

    @NotBlank
    private Guest guest;

    public LocalDate getEntry(){
        return period.getEntry();
    }
    public LocalDate getDeparture(){
        return period.getDeparture();
    }

}
