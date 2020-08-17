package com.kishwar.librarybookingapp.service;

import com.kishwar.librarybookingapp.io.repository.BookRepository;
import com.kishwar.librarybookingapp.io.repository.BookingRepository;
import com.kishwar.librarybookingapp.io.repository.UserRepository;
import com.kishwar.librarybookingapp.ui.model.BookModel;
import com.kishwar.librarybookingapp.ui.model.BookingModel;
import com.kishwar.librarybookingapp.ui.model.BookingRequestModel;
import com.kishwar.librarybookingapp.ui.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.Date;

@Service
public class BookingService {

    private static long count = 1;
}


