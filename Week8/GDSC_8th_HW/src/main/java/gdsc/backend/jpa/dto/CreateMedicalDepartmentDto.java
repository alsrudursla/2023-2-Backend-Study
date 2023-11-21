package gdsc.backend.jpa.dto;

import lombok.Getter;

@Getter
public class CreateMedicalDepartmentDto {
    private Long hospitalId;
    private String name;
}
