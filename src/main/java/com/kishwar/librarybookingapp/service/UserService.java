package com.kishwar.librarybookingapp.service;

import com.kishwar.librarybookingapp.io.repository.UserRepository;
import com.kishwar.librarybookingapp.ui.model.UserLoginModel;
import com.kishwar.librarybookingapp.ui.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public void createUser(UserModel userModel){
        userRepository.save(userModel);
    }

    public UserModel login(UserLoginModel user){
        return userRepository.getUserModelByUsername(user.getUsername());
    }

    public UserModel getUser(String username){
        return userRepository.getUserModelByUsername(username);
    }
}
