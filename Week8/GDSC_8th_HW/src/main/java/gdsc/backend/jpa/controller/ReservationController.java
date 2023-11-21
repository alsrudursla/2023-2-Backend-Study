package gdsc.backend.jpa.controller;

import gdsc.backend.jpa.domain.Reservation;
import gdsc.backend.jpa.dto.CreateReservationDto;
import gdsc.backend.jpa.dto.UpdateReservationDto;
import gdsc.backend.jpa.service.ReservationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reservations")
@RequiredArgsConstructor
public class ReservationController {
    private final ReservationService reservationService;

    @GetMapping()
    public List<Reservation> getAllReservations() {
        return reservationService.getAllReservations();
    }

    @PostMapping()
    public void createReservation(@RequestBody CreateReservationDto createReservationDto) {
        reservationService.createReservation(createReservationDto);
    }

    @PatchMapping("/{id}")
    public void updateReservation(@PathVariable("id") Long id, @RequestBody UpdateReservationDto updateReservationDto) {
        reservationService.updateReservation(id, updateReservationDto);
    }

    @DeleteMapping("/{id}")
    public void deleteReservation(@PathVariable("id") Long id) {
        reservationService.deleteReservation(id);
    }
}
