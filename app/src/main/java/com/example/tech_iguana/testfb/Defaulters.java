package com.example.tech_iguana.testfb;

public class Defaulters {
    public String dname;
    public String location;
    public String reason;
    public String treatment;
    public String comments;

    public Defaulters(String dname, String location, String reason, String treatment, String comments) {
        this.dname = dname;
        this.location = location;
        this.reason = reason;
        this.treatment = treatment;
        this.comments = comments;
    }

    public Defaulters() {
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getTreatment() {
        return treatment;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}
