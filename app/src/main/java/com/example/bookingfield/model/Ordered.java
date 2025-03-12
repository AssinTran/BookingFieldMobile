package com.example.bookingfield.model;
import java.util.Date;

public class Ordered {
    private String Id;
    private Field Field;
    private TimeSchedule TimeOrder;
    private Date DateOrder;
    private String UserPhone;
    private User User;
    private double Price;
    private Status Status;

    public Ordered(Date dateOrder, String id, double price, TimeSchedule timeOrder, String userPhone) {
        DateOrder = dateOrder;
        Id = id;
        Price = price;
        Status = Status.Pending;
        TimeOrder = timeOrder;
        UserPhone = userPhone;
    }

    public Date getDateOrder() {
        return DateOrder;
    }

    public void setDateOrder(Date dateOrder) {
        DateOrder = dateOrder;
    }

    public com.example.bookingfield.model.Field getField() {
        return Field;
    }

    public void setField(com.example.bookingfield.model.Field field) {
        Field = field;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }

    public com.example.bookingfield.model.Status getStatus() {
        return Status;
    }

    public void setStatus(com.example.bookingfield.model.Status status) {
        Status = status;
    }

    public TimeSchedule getTimeOrder() {
        return TimeOrder;
    }

    public void setTimeOrder(TimeSchedule timeOrder) {
        TimeOrder = timeOrder;
    }

    public com.example.bookingfield.model.User getUser() {
        return User;
    }

    public void setUser(com.example.bookingfield.model.User user) {
        User = user;
    }

    public String getUserPhone() {
        return UserPhone;
    }

    public void setUserPhone(String userPhone) {
        UserPhone = userPhone;
    }
}
