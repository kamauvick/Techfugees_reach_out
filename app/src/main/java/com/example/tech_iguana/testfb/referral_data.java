package com.example.tech_iguana.testfb;

public class referral_data {
    private String name;
    private String age;
    private String reason;
    private String treatment;
    private String comments;
    //Chronic illness

    public referral_data() {
    }

    public referral_data(String name, String age, String reason, String treatment, String comments) {
        this.name = name;
        this.age = age;
        this.reason = reason;
        this.treatment = treatment;
        this.comments = comments;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
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
