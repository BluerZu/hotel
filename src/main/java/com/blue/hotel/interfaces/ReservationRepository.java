package com.blue.hotel.interfaces;

import com.blue.hotel.models.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {
}
