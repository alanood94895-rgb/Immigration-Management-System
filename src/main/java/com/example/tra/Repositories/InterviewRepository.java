package com.example.tra.Repositories;

import com.example.tra.Entities.Interview;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface InterviewRepository  extends JpaRepository<Interview, Long> {

    List<Interview> findByOfficerIdAndInterviewDate(Long officerId, String date);
    List<Interview> findByApplicantId(Long applicantId);
    List<Interview> findByStatus(String status);
    List<Interview> findByApplicantIdAndStatus(Long applicantId, String status);
}
