package com.example.tra;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Applicant extends Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
}
