package com.blue.hotel.services;

import com.blue.hotel.interfaces.GuestRepository;
import com.blue.hotel.models.Guest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GuestService {

    @Autowired
    private GuestRepository guestRepository;

    public List<Guest> getAllGuests(){
        return guestRepository.findAll();
    }
    public Guest createGuest(Guest guest){
        return guestRepository.save(guest);
    }
    public Guest updateGuest(Guest guest){
        return guestRepository.save(guest);
    }
    public void deleteGuest(Long id){
        guestRepository.deleteById(id);
    }
}
