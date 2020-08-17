package com.kishwar.librarybookingapp.io.repository;

import com.kishwar.librarybookingapp.ui.model.BookingModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingRepository extends CrudRepository<BookingModel, Long> {

}
