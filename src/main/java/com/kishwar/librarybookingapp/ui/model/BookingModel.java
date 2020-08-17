package com.kishwar.librarybookingapp.ui.model;

import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="booking")
public class BookingModel {

    @Id
    @GeneratedValue
    long id;

    @Column(name="user_id")
    int userId;

    @Column(name="book_id")
    int bookId;

    @Column(name="booking_date")
    Date bookingDate;

    @Column(name="return_date")
    Date returnDate;

    @Column(name="fine")
    @Nullable
    double fine;

    @ManyToOne
    UserModel userModel;
    @ManyToOne
    BookModel bookModel;


    public long getId () {
        return id;
    }

    public void setId (long id) {
        this.id = id;
    }

    public int getUserId () {
        return userId;
    }

    public void setUserId (int userId) {
        this.userId = userId;
    }

    public int getBookId () {
        return bookId;
    }

    public void setBookId (int bookId) {
        this.bookId = bookId;
    }

    public Date getBookingDate () {
        return bookingDate;
    }

    public void setBookingDate (Date bookingDate) {
        this.bookingDate = bookingDate;
    }

    public Date getReturnDate () {
        return returnDate;
    }

    public void setReturnDate (Date returnDate) {
        this.returnDate = returnDate;
    }

    public double getFine () {
        return fine;
    }

    public void setFine (double fine) {
        this.fine = fine;
    }

    public UserModel getUserModel () {
        return userModel;
    }

    public void setUserModel (UserModel userModel) {
        this.userModel = userModel;
    }

    public BookModel getBookModel () {
        return bookModel;
    }

    public void setBookModel (BookModel bookModel) {
        this.bookModel = bookModel;
    }
}
