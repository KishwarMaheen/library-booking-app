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

    @Autowired
    BookService bookService;

    @Autowired
    UserService userService;

    @Autowired
    BookingRepository bookingRepository;

    private static long count = 1;

    public boolean createBooking(String username, long bookId){
        UserModel userModel = userService.getUser(username);
        System.out.println(username);
        BookModel bookModel = bookService.getBookById(bookId);
        System.out.println(bookId);
        if(userModel!=null&&bookModel!=null){
            BookingModel bookingModel = new BookingModel();
            bookingModel.setUsers(userModel);
            bookingModel.setBooks(bookModel);
            Calendar cal = Calendar.getInstance();
            Date date = cal.getTime();
            bookingModel.setBookingDate(date);
            cal.add(Calendar.DAY_OF_YEAR, 7);
            date = cal.getTime();
            bookingModel.setReturnDate(date);
            bookingModel.setFine(0);
            bookingRepository.save(bookingModel);
            return true;
        }
        return false;
    }
}


