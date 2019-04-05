package com.example.tech_iguana.testfb;

public class gen_data {
    public String urgency;
    private String refname;
    private String refAge;
    private String refgender;
    private String location;
    private String ttime;
    private String refsymptomps;
    private String Tag;
    private String actiontaken;
    private String referref;


    public gen_data() {

    }

    public gen_data(String refname, String refAge, String refgender, String location, String ttime, String refsymptomps, String tag, String actiontaken, String urgency, String referref) {
        this.refname = refname;
        this.refAge = refAge;
        this.refgender = refgender;
        this.location = location;
        this.ttime = ttime;
        this.refsymptomps = refsymptomps;
        Tag = tag;
        this.actiontaken = actiontaken;
        this.urgency = urgency;
        this.referref = referref;
    }

    public String getRefname() {
        return refname;
    }

    public String getRefAge() {
        return refAge;
    }

    public void setRefAge(String refAge) {
        this.refAge = refAge;
    }

    public String getRefgender() {
        return refgender;
    }

    public void setRefgender(String refgender) {
        this.refgender = refgender;
    }

    public String getLocation() {
        return location;
    }

    public String getTtime() {
        return ttime;
    }

    public void setTtime(String ttime) {
        this.ttime = ttime;
    }

    public String getUrgency() {
        return urgency;
    }

    public void setUrgency(String urgency) {
        this.urgency = urgency;
    }

    public String getRefsymptomps() {
        return refsymptomps;
    }

    public void setRefsymptomps(String refsymptomps) {
        this.refsymptomps = refsymptomps;
    }

    public String gettag() {
        return Tag;
    }

    public String getActiontaken() {
        return actiontaken;
    }

    public void setActiontaken(String actiontaken) {
        this.actiontaken = actiontaken;
    }

    public String isReferref() {
        return referref;
    }

    public void setrefname(String refname) {
        this.refname = refname;
    }

    public void setlocation(String location) {
        this.location = location;
    }

    public void settag(String tag) {
        Tag = tag;
    }

    public void setReferref(String referref) {
        this.referref = referref;
    }


}
