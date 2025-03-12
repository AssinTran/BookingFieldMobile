package com.example.bookingfield.helper;

import android.text.TextUtils;
import android.util.Patterns;
public class Validator {
    public boolean ValidPhone(String phone){
        return !TextUtils.isEmpty(phone) && Patterns.PHONE.matcher(phone).matches();
    }

    public boolean ValidEmail(String email){
        return  !TextUtils.isEmpty(email) && Patterns.EMAIL_ADDRESS.matcher(email).matches();
    }

    public boolean StrongPassword(String pass){
        return !TextUtils.isEmpty(pass) && pass.length() >= 8;
    }


}
