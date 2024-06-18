package com.blue.hotel.interfaces;

import com.blue.hotel.models.Guest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GuestRepository extends JpaRepository<Guest, Long> {
}
