package com.howtodoinjava.example.sampleservice.model;

import java.io.Serializable;
import java.util.List;

public class EmployeeProfile implements Serializable {

    private static final long serialVersionUID = 3705958972000701963L;
    public List<String> profiles;

    public List<String> getProfiles() {
        return profiles;
    }

    public void setProfiles(List<String> profiles) {
        this.profiles = profiles;
    }

    @Override
    public String toString() {
        return "EmployeeProfile [profilesList=" + profiles + "]";
    }
}
