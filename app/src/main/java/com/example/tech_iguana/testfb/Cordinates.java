package com.example.tech_iguana.testfb;

public class Cordinates {
    private double longitude, latitude;

    public Cordinates(double longitude, double latitude) {
        this.longitude = longitude;
        this.latitude = latitude;

    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }
}
