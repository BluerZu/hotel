package com.blue.hotel.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@Entity
public class Guest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long guestId;
    private String firstName;
    private String lastName;
    private Date dateOfBirth;
    private String nationality;
    private String phoneNumber;

    @OneToMany(mappedBy = "guest", cascade = CascadeType.ALL)
    @JsonIgnoreProperties("guest")
    private List<Reservation> reservations = new ArrayList<>();
}