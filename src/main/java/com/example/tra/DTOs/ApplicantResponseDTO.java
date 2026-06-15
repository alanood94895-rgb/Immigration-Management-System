package com.example.tra.DTOs;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ApplicantResponseDTO {
    private Long    id;
    private String  firstName;
    private String  lastName;
    private String  passportNumber;
    private String  nationality;
    private boolean criminalRecord;
}