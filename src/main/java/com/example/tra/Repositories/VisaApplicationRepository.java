package com.example.tra.Repositories;

import com.example.tra.Entities.VisaApplication;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VisaApplicationRepository  extends JpaRepository<VisaApplication, Long> {
    List<VisaApplication> findByApplicantId(Long applicantId);
    List<VisaApplication> findByStatus(String status);
}
