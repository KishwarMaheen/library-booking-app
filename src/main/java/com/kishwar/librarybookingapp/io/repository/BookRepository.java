package com.kishwar.librarybookingapp.io.repository;

import com.kishwar.librarybookingapp.ui.model.BookModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends CrudRepository<BookModel, Long> {

}
