package com.kishwar.librarybookingapp.service;

import com.kishwar.librarybookingapp.io.repository.UserRepository;
import com.kishwar.librarybookingapp.ui.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public boolean createUser(String username, String password, String email, String phoneNumber){
        if(userRepository.getUserModelByUsername(username)==null
        && !(username.equals("")) && !(password.equals("")) && !(email.equals("")) &&
                !(phoneNumber.equals(""))){
            UserModel userModel = new UserModel();
            userModel.setUsername(username);
            userModel.setPassword(password);
            userModel.setEmail(email);
            userModel.setPhoneNumber(phoneNumber);
            userRepository.save(userModel);
            return true;
        }
        return false;
    }

    public int login(String username, String password){
        UserModel userModel = userRepository.getUserModelByUsername(username);
        if(userModel==null){
            return -1;
        }
        else if(userModel.getPassword().equals(password)){
            return 1;
        }
        else{
            return 0;
        }
    }

    public UserModel getUser(String username){
        return userRepository.getUserModelByUsername(username);
    }
}
