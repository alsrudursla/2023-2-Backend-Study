package gdsc.backend.jpa.repository;

import gdsc.backend.jpa.domain.Hospital;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface HospitalRepository extends JpaRepository<Hospital, Long> {
    public Hospital findByName(String name);
    public Optional<Hospital> findById(Long id);
}
