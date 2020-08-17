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
}
