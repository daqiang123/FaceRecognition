package com.itboyst.facedemo;

public class FaceRegisterInfo {
    private byte[] featureData;
    private Integer groupId;
    private String name;

    public FaceRegisterInfo(byte[] faceFeature, Integer groupId, String name) {
        this.featureData = faceFeature;
        this.groupId = groupId;
        this.name = name;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte[] getFeatureData() {
        return featureData;
    }

    public void setFeatureData(byte[] featureData) {
        this.featureData = featureData;
    }

}
