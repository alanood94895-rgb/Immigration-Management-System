package com.example.tra.DTOs;

import com.example.tra.Entities.Applicant;

public class ApplicantMapper {
    private ApplicantMapper() {}

    public static Applicant toEntity(ApplicantRequestDTO dto) {
        Applicant applicant = new Applicant();
        applicant.setFirstName(dto.getFirstName());
        applicant.setLastName(dto.getLastName());
        applicant.setPassportNumber(dto.getPassportNumber());
        applicant.setNationality(dto.getNationality());
        return applicant;
    }

    public static ApplicantResponseDTO toResponseDTO(Applicant applicant) {
        return new ApplicantResponseDTO(
                applicant.getId(),
                applicant.getFirstName(),
                applicant.getLastName(),
                applicant.getPassportNumber(),
                applicant.getNationality(),
                applicant.getCriminalRecord()
        );
    }

}
