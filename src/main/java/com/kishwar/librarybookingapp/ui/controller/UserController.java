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
    public String createUser(@RequestBody UserModel userModel) throws Exception {
        userService.createUser(userModel);
        return "User created!";
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
