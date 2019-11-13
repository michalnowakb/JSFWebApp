package com.sparta.mjn.services;

import com.sparta.mjn.components.User;

public class LoginService {

    public String validateUser(User user) {
    if(user.getUserName().equals("Michal") && user.getPassword().equals("sparta")){
        return "loggedUser";
    } else {
        return "login";
        }
    }
}
