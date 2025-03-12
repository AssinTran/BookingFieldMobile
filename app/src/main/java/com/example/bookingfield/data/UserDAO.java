package com.example.bookingfield.data;

import com.example.bookingfield.model.User;

public class UserDAO extends DAO<User> {

    private String API;

    public UserDAO() {
        API = this.getBASE_API() + "Auth/";
    }

    @Override
    public void Get() {

    }

    @Override
    public User Get(String id) {
        return null;
    }

    @Override
    public void Add(User object) {

    }

    @Override
    public void Update(User object) {

    }

    @Override
    public void Delete(String id) {

    }

    public boolean Login(User user){

        return false;
    }

    public boolean SignUp(User user){
        return false;
    }
}
