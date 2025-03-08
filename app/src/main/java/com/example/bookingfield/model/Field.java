package com.example.bookingfield.model;

import java.util.List;

public class Field {
    public enum FieldStatus{
        Pending,Free, Ordered
    }
    private String Id;
    private String Name;
    private String FieldType;
    private List<TimeSchedule> Times;
    private double Price;

    private FieldStatus Status;
}
