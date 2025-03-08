package com.example.bookingfield.model;

import java.sql.Time;

public class TimeSchedule {
    private String Id;
    private Time Start, End;

    private boolean Ordered;

    public TimeSchedule(String id, Time start, Time end, boolean ordered) {
        Id = id;
        Start = start;
        End = end;
        Ordered = ordered;
    }

    public TimeSchedule() {
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public Time getStart() {
        return Start;
    }

    public void setStart(Time start) {
        Start = start;
    }

    public Time getEnd() {
        return End;
    }

    public void setEnd(Time end) {
        End = end;
    }

    public boolean isOrdered() {
        return Ordered;
    }

    public void setOrdered(boolean ordered) {
        Ordered = ordered;
    }
}
