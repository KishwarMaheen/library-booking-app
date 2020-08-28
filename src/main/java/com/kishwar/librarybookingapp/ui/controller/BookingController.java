package com.kishwar.librarybookingapp.ui.controller;

import com.kishwar.librarybookingapp.service.BookingService;
import com.kishwar.librarybookingapp.ui.model.BookingModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("bookings")
public class BookingController {

    @Autowired
    BookingService bookingService;

    @CrossOrigin
    @PostMapping(path = "/{username}/{bookId}")
    public boolean createBooking(@PathVariable String username, @PathVariable long bookId){
        return bookingService.createBooking(username, bookId);
    }

    @CrossOrigin
    @GetMapping(path = "/{username}")
    public List<BookingModel> viewBookings(@PathVariable String username){
        return bookingService.viewBookings(username);
    }

}
