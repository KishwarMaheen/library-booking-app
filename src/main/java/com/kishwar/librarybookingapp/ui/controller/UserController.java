package com.kishwar.librarybookingapp.ui.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("users")
public class UserController {

    @GetMapping
    public String getUser(){
        return "get was called";
    }

    @PostMapping
    public String createUser(){
        return "create was called";
    }

    @PutMapping
    public String updateUser(){
        return "update was called";
    }

    @DeleteMapping
    public String deleteUser(){
        return "delete was called";
    }

}
