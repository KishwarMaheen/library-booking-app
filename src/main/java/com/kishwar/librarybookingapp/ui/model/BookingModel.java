package com.kishwar.librarybookingapp.ui.model;

import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "booking")
public class BookingModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;
    
    @Column(name="booking_date")
    Date bookingDate;

    @Column(name="return_date")
    Date returnDate;

    @Column(name="fine")
    @Nullable
    double fine;
    
    @ManyToOne
    UserModel users;
    @ManyToOne
    BookModel books;
    
    
    public long getId () {
        return id;
    }
    
    public void setId (long id) {
        this.id = id;
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
    
    public UserModel getUsers () {
        return users;
    }
    
    public void setUsers (UserModel users) {
        this.users = users;
    }
    
    public BookModel getBooks () {
        return books;
    }
    
    public void setBooks (BookModel books) {
        this.books = books;
    }
    
}
