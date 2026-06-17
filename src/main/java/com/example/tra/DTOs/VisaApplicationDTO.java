package com.example.tra.DTOs;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class VisaApplicationDTO {
    private Long id;
    private String visaType;
    private String status;
    private String officerNotes;
    private Long applicantId;
    private Long officerId;
}
