package com.project.servlet;

public class User {
    private String firstName;
    private String lastName;
    private String gmail;
    private String password;

    // 1. No-argument constructor
    public User() {
    }

    // 2. All-argument constructor
    public User(String firstName, String lastName, String gmail, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gmail = gmail;
        this.password = password;
    }

    // 3. Getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGmail() {
        return gmail;
    }

    public String getPassword() {
        return password;
    }

    // 4. Setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}



