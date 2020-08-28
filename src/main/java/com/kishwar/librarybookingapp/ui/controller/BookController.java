package com.kishwar.librarybookingapp.ui.controller;

import com.kishwar.librarybookingapp.service.BookService;
import com.kishwar.librarybookingapp.ui.model.BookModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("books")
public class BookController {

    @Autowired
    BookService bookService;

    @CrossOrigin
    @GetMapping
    public List<BookModel> getAllBooks(){
        return bookService.getAllBooks();
    }
}
