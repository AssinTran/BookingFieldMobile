package com.example.bookingfield.viewmodel;

import com.example.bookingfield.helper.Validator;
import com.example.bookingfield.model.User;

public class Auth {
    private Validator valid;
    public void Login(User user){
        valid = new Validator();
        if(!valid.ValidPhone(user.getPhone())){
            return;
        }
    }

    public void  Register(User user){
        valid = new Validator();
        if (!valid.ValidPhone(user.getPhone())){
            return;
        }
        if (!valid.ValidEmail(user.getEmail())){
            return;
        }
        if (!valid.StrongPassword(user.getPassword())){
            return;
        }

    }

}
