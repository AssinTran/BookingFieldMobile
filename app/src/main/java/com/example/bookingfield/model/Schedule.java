package com.example.bookingfield.model;

import java.sql.Time;
import java.util.Date;

public class Schedule {
    private String Id;
    private TimeSchedule timeId;
    private Date BookDate;
    private Field FieldId;
    private User UserId;
    public String getId() {
        return Id;
    }
    public Date getBookDate() {
        return BookDate;
    }
    public Field getFieldId() {
        return FieldId;
    }
    public TimeSchedule getTimeId() {
        return timeId;
    }
    public User getUserId() {
        return UserId;
    }
    public void setId(String id) {
        Id = id;
    }
    public void setBookDate(Date bookDate) {
        BookDate = bookDate;
    }
    public void setFieldId(Field fieldId) {
        FieldId = fieldId;
    }
    public void setTimeId(TimeSchedule timeId) {
        this.timeId = timeId;
    }
    public void setUserId(User userId) {
        UserId = userId;
    }
}
