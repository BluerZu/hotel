package com.blue.hotel.controllers;

import com.blue.hotel.models.Guest;
import com.blue.hotel.services.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(path="api/v1/guest")
public class GuestController {

    private final GuestService guestService;

    @Autowired
    public GuestController(GuestService guestService) {
        this.guestService = guestService;
    }
    @GetMapping
    public List<Guest> getGuests(){
        return guestService.getAllGuests();
    }
    @PostMapping
    public Guest createGuest(@RequestBody Guest guest){
        return guestService.createGuest(guest);
    }
    @PutMapping("/{id}")
    public Guest updateGuest(@RequestBody Guest guest, @PathVariable Long id){
        guest.setGuestId(id);
        return guestService.createGuest(guest);
    }
    @DeleteMapping("/{id}")
    public Map<String, String> deleteGuest(@PathVariable Long id) {
        guestService.deleteGuest(id);
        Map<String, String> response = new HashMap<>();
        response.put("response", "Huésped con id " + id + " borrado correctamente");
        return response;
    }
}
