package com.sv.group10.socialMedia.model;

import java.time.LocalDateTime;


public class Customer {

    private String id;
    private String name;
    private int age;
    private String gender;
    private String email;
    private String phoneNumber;
    private boolean active;
    private final LocalDateTime registeredAt;

    public Customer(){
        this.registeredAt = LocalDateTime.now();
        this.active = true;
    }

    public Customer(String id, String name, int age, String gender, String email, String phoneNumber){
        this();
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    //Getters

    public LocalDateTime getRegisteredAt() {
        return registeredAt;
    }

    public boolean isActive() {
        return active;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }


    //Setters
    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getCustomerInfo() {
        return """
            ID: %s
            Name: %s
            Age: %d
            Gender: %s
            Email: %s
            Phone Number: %s
            Active: %s
            Registered At: %s
            """.formatted(id, name, age, gender, email, phoneNumber, active, registeredAt);
    }
}
