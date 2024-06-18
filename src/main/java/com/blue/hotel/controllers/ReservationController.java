package com.blue.hotel.controllers;

import com.blue.hotel.models.Reservation;
import com.blue.hotel.services.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(path="api/v1/reservation")
public class ReservationController {

    private final ReservationService reservationService;

    @Autowired
    public ReservationController(ReservationService reservationService) {
        this.reservationService = reservationService;
    }
    @GetMapping
    public List<Reservation> getReservations(){
        return reservationService.getAllReservations();
    }
    @PostMapping
    public Reservation createReservation(@RequestBody Reservation reservation){
        return reservationService.createReservation(reservation);
    }
    @PutMapping("/{id}")
    public Reservation updateReservation(@RequestBody Reservation reservation, @PathVariable Long id){
        reservation.setReservationId(id);
        return reservationService.createReservation(reservation);
    }
    @DeleteMapping("/{id}")
    public Map<String, String> deleteReservation(@PathVariable Long id) {
        reservationService.deleteReservation(id);
        Map<String, String> response = new HashMap<>();
        response.put("response", "Reservación con id " + id + " borrado correctamente");
        return response;
    }
}
