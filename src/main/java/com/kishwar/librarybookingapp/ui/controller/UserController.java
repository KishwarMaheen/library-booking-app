package com.kishwar.librarybookingapp.ui.controller;

import com.kishwar.librarybookingapp.service.UserService;
import com.kishwar.librarybookingapp.ui.model.UserLoginModel;
import com.kishwar.librarybookingapp.ui.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("users")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping
    @CrossOrigin
    public String createUser(@RequestParam(value = "username", required = false)
                                         String username,
                             @RequestParam(value = "password", required = false) String password,
                             @RequestParam(value = "email", required = false) String email,
                             @RequestParam(value = "phoneNumber", required = false) String phoneNumber)
            throws Exception {
        UserModel userModel = new UserModel();
        userModel.setUsername(username);
        System.out.println("Username: " + username);
        userModel.setPassword(password);
        System.out.println("Password: " + password);
        userModel.setEmail(email);
        System.out.println("Email: " + email);
        userModel.setPhoneNumber(phoneNumber);
        System.out.println("Phone Number: " + phoneNumber);
        userService.createUser(userModel);
        return "<h1>User created!</h1>";
    }

    @GetMapping
    public String login(@RequestBody UserLoginModel user){
        UserModel userModel = userService.login(user);
        if(userModel==null){
            return "User doesn't exist!";
        }
        else if(userModel.getPassword().equals(user.getPassword())){
            return "Successfully logged in!";
        }
        else{
            return "Wrong password!";
        }
    }
}
