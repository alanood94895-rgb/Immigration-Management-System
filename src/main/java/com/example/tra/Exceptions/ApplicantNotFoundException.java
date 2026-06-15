package com.example.tra.Exceptions;

public class ApplicantNotFoundException extends RuntimeException{
    public ApplicantNotFoundException(Long id) {
        super("Applicant not found with id: " + id);
    }

    public ApplicantNotFoundException(String message) {
        super(message);
    }
}
