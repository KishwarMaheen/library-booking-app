package com.kishwar.librarybookingapp.ui.controller;

import com.kishwar.librarybookingapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("users")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping
    @CrossOrigin
    public boolean createUser(@RequestParam(value = "username", required = false)
                                         String username,
                             @RequestParam(value = "password", required = false) String password,
                             @RequestParam(value = "email", required = false) String email,
                             @RequestParam(value = "phoneNumber", required = false) String phoneNumber){
        return userService.createUser(username, password, email, phoneNumber);
    }

    @GetMapping
    @CrossOrigin
    public int login(@RequestParam(value = "username", required = false)
                                 String username,
                     @RequestParam(value = "password", required = false) String password){
        return userService.login(username, password);
    }
}
