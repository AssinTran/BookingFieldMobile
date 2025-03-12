package com.example.bookingfield.model;

import java.util.Date;

public class Schedule {
    private String id;
    private String userPhone;
    private User user;
    private String fieldID;
    private Field field;
    private TimeSchedule time;
    private Date date;
    private double price;
    private Status status;

    public Schedule(Date date, String fieldID, String id, double price, TimeSchedule time, String userPhone) {
        this.date = date;
        this.fieldID = fieldID;
        this.id = id;
        this.price = price;
        this.time = time;
        this.userPhone = userPhone;
        this.status = Status.Pending;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Field getField() {
        return field;
    }

    public void setField(Field field) {
        this.field = field;
    }

    public String getFieldID() {
        return fieldID;
    }

    public void setFieldID(String fieldID) {
        this.fieldID = fieldID;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public TimeSchedule getTime() {
        return time;
    }

    public void setTime(TimeSchedule time) {
        this.time = time;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }
}
