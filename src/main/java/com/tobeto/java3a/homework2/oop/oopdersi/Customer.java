package com.tobeto.java3a.homework2.oop.oopdersi;

//abstrac classlar newle çağırılmaz
public abstract class Customer {
    private int id;
    private String city;

    public Customer(int id, String city) {
        this.id = id;
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}