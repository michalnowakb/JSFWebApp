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



    public String registerUser(User user){
        if(user.getUserName().equals("eXo")){
            return "UserNameBeenUsed";
        } else
        return "welcomeNewUser";
    }
}
