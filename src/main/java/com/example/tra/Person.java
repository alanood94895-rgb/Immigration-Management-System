package com.example.tra;

import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public class Person {
    String firstName;
    String lastName;
    String gender;
    String phoneNumber;
    String email;

}
