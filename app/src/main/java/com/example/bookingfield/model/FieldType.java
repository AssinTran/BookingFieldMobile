package com.example.bookingfield.model;

import java.io.File;
import java.util.List;

public class FieldType {
    private String Id;
    private String Name;
    private List<Field> Field;
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
    public List<Field> getField() {
        return Field;
    }
    public void setField(List<Field> field) {
        Field = field;
    }
}
