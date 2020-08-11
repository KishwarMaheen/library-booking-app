package com.kishwar.librarybookingapp.ui.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("books")
public class BookController {

    @GetMapping
    public String getBooks(){
        String s = "get books was called";
        return s;
    }
}
