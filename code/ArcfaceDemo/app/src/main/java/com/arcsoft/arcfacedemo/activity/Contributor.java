package com.arcsoft.arcfacedemo.activity;

import java.sql.Blob;

public class Contributor {
    public String login;
    public Integer contributions;
    // private byte[] featureData;
    private String featureData;

    public Contributor() {

    }

    public Contributor(String faceFeature, String login, Integer contributions) {
        this.featureData = faceFeature;
        this.login = login;
        this.contributions = contributions;
    }

    public String getLogin() {
        return login;
    }

    public Integer getContributions() {
        return contributions;
    }

    public String getFeatureData() {
        return featureData;
    }

    public void setFeatureData(String featureData) {
        this.featureData = featureData;
    }

}
