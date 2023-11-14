package gdsc.backend.jpa.service;

import gdsc.backend.jpa.dto.AddPatientDto;
import gdsc.backend.jpa.domain.Patient;
import gdsc.backend.jpa.repository.PatientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PatientService {
    private final PatientRepository patientRepository;

    public void addPatient(AddPatientDto addPatientDto) {
        patientRepository.save(new Patient(addPatientDto.getName()));
    }

    public List<Patient> getAllPatients() {
        return patientRepository.findAll();
    }
}
