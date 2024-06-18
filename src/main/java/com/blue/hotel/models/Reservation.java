package com.blue.hotel.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long reservationId;

    private Date checkInDate;
    private Date checkOutDate;
    private double cost;
    private String paymentMethod;

    @ManyToOne
    @JoinColumn(name = "guestId")
    @JsonIgnoreProperties("reservations")
    private Guest guest;
}