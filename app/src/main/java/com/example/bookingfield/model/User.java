package com.example.bookingfield.model;

public class User {
    private String Id;
    private String Name;
    private String Phone;
    private String Password;
    private String Email;

    public User() {
    }

    public User(String id, String name, String phone, String password, String email) {
        Id = id;
        Name = name;
        Phone = phone;
        Password = password;
        Email = email;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }
}
