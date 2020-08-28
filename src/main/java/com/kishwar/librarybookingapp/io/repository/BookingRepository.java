package com.kishwar.librarybookingapp.io.repository;

import com.kishwar.librarybookingapp.ui.model.BookModel;
import com.kishwar.librarybookingapp.ui.model.BookingModel;
import com.kishwar.librarybookingapp.ui.model.UserModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookingRepository extends CrudRepository<BookingModel, Long> {
    public BookingModel findBookingModelByUsersAndBooks(UserModel userModel, BookModel bookModel);
    public List<BookingModel> findBookingModelsByUsers(UserModel userModel);
}
