package com.sumanth.studentManagement;

public class Student {
    private String name;
    private String gender;
    private int uid;
    private String city;

    public Student(String name, String gender, int uid, String city) {
        this.name = name;
        this.gender = gender;
        this.uid = uid;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
