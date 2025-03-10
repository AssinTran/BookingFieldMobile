package com.example.bookingfield.model;

import android.util.JsonWriter;

import org.json.JSONObject;

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

    @Override
    public String toString() {
        JSONObject json = new JSONObject();
        try {
            json.put("id",getId());
            json.put("name",getName());
            json.put("phone", getPhone());
            json.put("password",getPassword());
            json.put("email", getEmail());

            return json.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }
}
