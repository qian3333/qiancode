package com.qianscode.qiancode.student;

import java.util.UUID;

public class Student {
    private final UUID id;
    private  final  String firstname;
    private  final  String lastname;
    private  final  String email;
    private  final  Gender gender;

    public Student(UUID id, String firstname, String lastname, String email, Gender gender) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.gender = gender;
    }

    public String getFirstname() {
        return firstname;
    }

    public UUID getId() {
        return id;
    }

    public Gender getGender() {
        return gender;
    }

    public String getEmail() {
        return email;
    }

    public String getLastname() {
        return lastname;
    }

    enum Gender{
        MALE,FEMALE
    }
}
