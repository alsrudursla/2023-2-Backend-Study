package gdsc.backend.jpa.dto;

import lombok.Getter;

@Getter
public class CreateReservationDto {
    private String time;
    private Long doctorId;
    private Long patientId;
}
