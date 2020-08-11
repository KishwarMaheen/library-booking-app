package com.kishwar.librarybookingapp.ui.controller;

import com.kishwar.librarybookingapp.service.BookService;
import com.kishwar.librarybookingapp.ui.model.BookModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("books")
public class BookController {

    @Autowired
    BookService bookService;

    @GetMapping
    public List<BookModel> getAllBooks(){
        return bookService.getAllBooks();
    }
}
