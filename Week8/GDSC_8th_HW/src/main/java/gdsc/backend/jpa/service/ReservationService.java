package gdsc.backend.jpa.service;

import gdsc.backend.jpa.domain.*;
import gdsc.backend.jpa.dto.CreateMedicalDepartmentDto;
import gdsc.backend.jpa.dto.CreateReservationDto;
import gdsc.backend.jpa.dto.UpdateReservationDto;
import gdsc.backend.jpa.repository.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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

    @Transactional
    public void updateReservation(Long reservationId, UpdateReservationDto updateReservationDto) {
        Reservation reservation = reservationRepository.findById(reservationId).orElseThrow(RuntimeException::new);
        reservation.updateReservation(updateReservationDto.getTime());
    }

    public List<Reservation> getAllReservations() {
        return reservationRepository.findAll();
    }

    @Transactional
    public void deleteReservation(Long id) {
        reservationRepository.deleteById(id);
    }


//    public List<MedicalDepartment> getAllHospitals() {
//        return medicalDepartmentRepository.findAll();
//    }
}
