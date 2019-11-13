package com.sparta.mjn.services;


import com.sparta.mjn.components.User;

import javax.ejb.Stateless;
import javax.inject.Named;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

@Named
@Stateless
public class RegistrationService {

    Map<String,String> userBase;

    public static User createUser(String user){
        String userName = null;
        String firstName = null;
        String lastName = null;
        String password = null;

        User createdUser = new User(userName,firstName,lastName,password);
        return createdUser;
    }

    public String registerUser(String user){
        User registeredUser = createUser(user);
        userBase = new HashMap<>();
        String key = registeredUser.getUserName();
        userBase.put(key, String.valueOf(registeredUser));


        return "welcomeNewUser";
    }
}
