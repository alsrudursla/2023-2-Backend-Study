package gdsc.backend.jpa.service;

import gdsc.backend.jpa.dto.AddDoctorDto;
import gdsc.backend.jpa.domain.Doctor;
import gdsc.backend.jpa.repository.DoctorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DoctorService {
    private final DoctorRepository doctorRepository;

    public void addDoctor(AddDoctorDto addDoctorDto) {
        doctorRepository.save(new Doctor(addDoctorDto.getName()));
    }

    public List<Doctor> getAllDoctors() {
        return doctorRepository.findAll();
    }
}
