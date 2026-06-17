package com.example.tra.DTOs;


import com.example.tra.Entities.Interview;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class InterviewDTO {
    private Long id;
    private String interviewDate;
    private String status;
    private String purpose;
    private Long applicantId;
    private Long officerId;

    public static InterviewDTO convertToDTO(Interview interview) {
        InterviewDTO dto = new InterviewDTO();
        dto.setId(interview.getId());
        dto.setInterviewDate(interview.getInterviewDate());
        dto.setStatus(interview.getStatus());
        dto.setPurpose(interview.getPurpose());
        dto.setApplicantId(interview.getApplicant().getId());
        dto.setOfficerId(interview.getOfficer().getId());
        return dto;
    }
}
