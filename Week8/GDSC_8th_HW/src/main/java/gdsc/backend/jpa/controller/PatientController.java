package gdsc.backend.jpa.controller;

import gdsc.backend.jpa.dto.AddPatientDto;
import gdsc.backend.jpa.domain.Patient;
import gdsc.backend.jpa.service.PatientService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patients")
@RequiredArgsConstructor
public class PatientController {
    private final PatientService patientService;

    @GetMapping()
    public List<Patient> getAllPatients() {
        return patientService.getAllPatients();
    }

    @PostMapping()
    public void addPatient(@RequestBody AddPatientDto addPatientDto) {
        patientService.addPatient(addPatientDto);
    }
}
