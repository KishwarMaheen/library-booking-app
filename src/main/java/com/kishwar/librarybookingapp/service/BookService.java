package com.kishwar.librarybookingapp.service;

import com.kishwar.librarybookingapp.io.repository.BookRepository;
import com.kishwar.librarybookingapp.ui.model.BookModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {
    @Autowired
    BookRepository bookRepository;

    public List<BookModel> getAllBooks(){
        List<BookModel> books = new ArrayList<>();
        bookRepository.findAll().forEach(books::add);
        return books;
    }

    public BookModel getBookById(long id){
        return bookRepository.getBookModelById(id);
    }
}
