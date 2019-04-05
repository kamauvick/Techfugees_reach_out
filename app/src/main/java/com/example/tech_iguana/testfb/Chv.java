package com.example.tech_iguana.testfb;

public class Chv {
    public String name;
    public String id;
    public String phonenumber;
    public String location;

    public Chv() {
        // Default constructor required for calls to DataSnapshot.getValue(User.class)
    }

    public Chv(String name, String id, String phonenumber, String location) {
        this.name = name;
        this.id = id;
        this.phonenumber = phonenumber;
        this.location = location;

    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public String getLocation() {
        return location;
    }
}
