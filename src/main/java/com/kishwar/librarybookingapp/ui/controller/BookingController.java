package com.kishwar.librarybookingapp.ui.controller;

import com.kishwar.librarybookingapp.service.BookingService;
import com.kishwar.librarybookingapp.ui.model.BookingRequestModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("bookings")
public class BookingController {

    @Autowired
    BookingService bookingService;

    @PostMapping(path = "/{username}/{bookId}")
    public String createBooking(@PathVariable String username, @PathVariable long bookId){
        boolean created = bookingService.createBooking(username, bookId);
        if(created) {
            return "Booked!";
        }else {
            return "Error!";
        }
    }

}
