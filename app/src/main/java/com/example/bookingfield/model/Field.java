package com.example.bookingfield.model;

import java.util.List;

public class Field {
    public enum FieldStatus{
        Pending,Free, Ordered
    }
    private String Id;
    private String Name;
    private FieldType TypeId;
    private List<TimeSchedule> Times;
    private double Price;
    private FieldStatus Status;
    public String getId() {
        return Id;
    }
    public String getName() {
        return Name;
    }
    public FieldType getTypeId() {
        return TypeId;
    }
    public double getPrice() {
        return Price;
    }
    public FieldStatus getStatus() {
        return Status;
    }
    public List<TimeSchedule> getTimes() {
        return Times;
    }
    public void setId(String id) {
        Id = id;
    }
    public void setName(String name) {
        Name = name;
    }
    public void setTypeId(FieldType typeId) {
        TypeId = typeId;
    }
    public void setPrice(double price) {
        Price = price;
    }
    public void setTimes(List<TimeSchedule> times) {
        Times = times;
    }
    public void setStatus(FieldStatus status) {
        Status = status;
    }
}

