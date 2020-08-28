package com.kishwar.librarybookingapp.service;

import com.kishwar.librarybookingapp.io.repository.BookRepository;
import com.kishwar.librarybookingapp.io.repository.BookingRepository;
import com.kishwar.librarybookingapp.ui.model.BookModel;
import com.kishwar.librarybookingapp.ui.model.BookingModel;
import com.kishwar.librarybookingapp.ui.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Service
public class BookingService {

    @Autowired
    BookService bookService;

    @Autowired
    UserService userService;

    @Autowired
    BookingRepository bookingRepository;

    @Autowired
    BookRepository bookRepository;

    public boolean createBooking(String username, long bookId){
        UserModel userModel = userService.getUser(username);
        BookModel bookModel = bookService.getBookById(bookId);
        BookingModel bookingModel = bookingRepository.findBookingModelByUsersAndBooks(userModel, bookModel);
        if(userModel!=null&&bookModel!=null){
            if(bookingModel!=null){
                if((userModel.getId()==bookingModel.getUsers().getId()
                        && bookModel.getId()==bookingModel.getBooks().getId())
                || bookModel.getNumberInStock() == 0) {
                    return false;
                }
            }
            BookingModel newBookingModel = new BookingModel();
            newBookingModel.setUsers(userModel);
            newBookingModel.setBooks(bookModel);
            Calendar cal = Calendar.getInstance();
            Date date = cal.getTime();
            newBookingModel.setBookingDate(date);
            cal.add(Calendar.DAY_OF_YEAR, 7);
            date = cal.getTime();
            newBookingModel.setReturnDate(date);
            newBookingModel.setFine(0);
            bookingRepository.save(newBookingModel);
            bookModel.setNumberInStock(bookModel.getNumberInStock() - 1);
            bookRepository.save(bookModel);
            return true;
        }
        return false;
    }

    public List<BookingModel> viewBookings(String username){
        UserModel userModel = userService.getUser(username);
        return bookingRepository.findBookingModelsByUsers(userModel);
    }
}


