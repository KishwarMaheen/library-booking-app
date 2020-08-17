package com.kishwar.librarybookingapp.service;

import com.kishwar.librarybookingapp.io.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookingService {

    @Autowired
    BookingRepository bookingRepository;

    public void booking(String bookName){

    }
}
