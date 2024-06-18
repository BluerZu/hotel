package com.blue.hotel.services;

import com.blue.hotel.interfaces.ReservationRepository;
import com.blue.hotel.models.Reservation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservationService {

    @Autowired
    private ReservationRepository reservationRepository;

    public List<Reservation> getAllReservations(){
        return reservationRepository.findAll();
    }
    public Reservation createReservation(Reservation reservation){
        return reservationRepository.save(reservation);
    }
    public Reservation updateReservation(Reservation reservation){
        return reservationRepository.save(reservation);
    }
    public void deleteReservation(Long id){
        reservationRepository.deleteById(id);
    }
}
