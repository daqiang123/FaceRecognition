package com.arcsoft.arcfacedemo.model;

/**
 * @Author: st7251
 * @Date: 2018/12/3 10:11
 */
public class FaceSearchResDto {
    private String faceId;
    private Integer groupId;
    private String name;
    private Integer similarValue;
    private Integer age;
    private String gender;
    private String image;

    // private byte[] face;
    private String face;

    public FaceSearchResDto() {
    }

    public FaceSearchResDto(Integer groupId, String name, String face) {
        this.groupId = groupId;
        this.name = name;
        this.face = face;
    }

    public String getFaceId() {
        return faceId;
    }

    public void setFaceId(String faceId) {
        this.faceId = faceId;
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

    public Integer getSimilarValue() {
        return similarValue;
    }

    public void setSimilarValue(Integer similarValue) {
        this.similarValue = similarValue;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getFace() {
        return face;
    }

    public void setFace(String face) {
        this.face = face;
    }

}