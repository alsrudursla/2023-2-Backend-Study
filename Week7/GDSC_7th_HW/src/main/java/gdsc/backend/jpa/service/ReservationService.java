package gdsc.backend.jpa.service;

import gdsc.backend.jpa.domain.*;
import gdsc.backend.jpa.dto.CreateMedicalDepartmentDto;
import gdsc.backend.jpa.dto.CreateReservationDto;
import gdsc.backend.jpa.repository.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ReservationService {
    private final ReservationRepository reservationRepository;
    private final DoctorRepository doctorRepository;
    private final PatientRepository patientRepository;

    public void createReservation(CreateReservationDto createReservationDto) {
        Doctor doctor = doctorRepository.findById(createReservationDto.getDoctorId())
                .orElseThrow(RuntimeException::new);
        Patient patient = patientRepository.findById(createReservationDto.getPatientId())
                .orElseThrow(RuntimeException::new);
        reservationRepository.save(new Reservation(doctor, patient, createReservationDto.getTime()));
    }

    public List<Reservation> getAllReservations() {
        return reservationRepository.findAll();
    }


//    public List<MedicalDepartment> getAllHospitals() {
//        return medicalDepartmentRepository.findAll();
//    }
}
