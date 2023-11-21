package gdsc.backend.jpa.dto;

import lombok.Getter;

@Getter
public class UpdateReservationDto {
    private String time;
    private Long doctorId;
    private Long patientId;
}
