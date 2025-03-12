package com.example.bookingfield.data;

public abstract class DAO<T> {
    private String BASE_API ;

    public DAO() {
        this.BASE_API = "https://localhost:8000/";
    }

    public String getBASE_API() {
        return BASE_API;
    }

    public abstract void Get();
    public abstract T Get(String id);
    public abstract void Add(T object);
    public abstract void Update(T object);
    public abstract void Delete(String id);

}
