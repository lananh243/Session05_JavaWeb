package com.data.session05_java.ra.model;

public class StudentB2 {
    private String studentName;
    private int age;
    private String address;

    public StudentB2(String studentName, int age, String address) {
        this.studentName = studentName;
        this.age = age;
        this.address = address;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
