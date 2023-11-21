package gdsc.backend.jpa.service;

import gdsc.backend.jpa.dto.CreateHospitalDto;
import gdsc.backend.jpa.domain.Hospital;
import gdsc.backend.jpa.dto.UpdateHospitalDto;
import gdsc.backend.jpa.repository.HospitalRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor
@Service
@Transactional
public class HospitalService {
    private final HospitalRepository hospitalRepository;

    public void createHospital(CreateHospitalDto createHospitalDto) {
        hospitalRepository.save(new Hospital(createHospitalDto.getName()));
    }

    @Transactional
    public void updateHospital(Long id, UpdateHospitalDto updateHospitalDto) {
        Hospital hospital = hospitalRepository.findById(id).orElseThrow(RuntimeException::new);
        hospital.updateName(updateHospitalDto.getName());
    }

    public List<Hospital> getAllHospitals() {
        return hospitalRepository.findAll();
    }

    public Hospital getHospitalById(Long id) {
        return hospitalRepository.findById(id).orElseThrow(RuntimeException::new);
    }

    public Hospital getHospitalByName(String name) {
        return hospitalRepository.findByName(name);
    }

    @Transactional
    public void deleteHospital(Long id) {
        hospitalRepository.deleteById(id);
    }
}
