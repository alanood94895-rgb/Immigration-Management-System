package com.example.tra.Controllers;

import com.example.tra.DTOs.ApplicantDTO;
import com.example.tra.Entities.Applicant;
import com.example.tra.Entities.AsylumSeeker;
import com.example.tra.Repositories.ApplicantRepository;
import com.example.tra.Services.ApplicantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("applicant")
public class ApplicantController {

    @Autowired
    ApplicantService applicantService;


    @PostMapping
    public ResponseEntity<ApplicantDTO> registerApplicant(@RequestBody Applicant applicant){
        return ResponseEntity.ok(ApplicantDTO.convertToDTO(applicantService.saveApplicant(applicant)));
    }

    @PostMapping("/asylum")
    public ResponseEntity<ApplicantDTO> registerAsylumSeeker(@RequestBody AsylumSeeker asylumSeeker) {
        return ResponseEntity.ok(ApplicantDTO.convertToDTO(applicantService.saveApplicant(asylumSeeker)));
    }

    @GetMapping
    public ResponseEntity<List<ApplicantDTO>> getAllApplicants(){
        return ResponseEntity.ok(ApplicantDTO.convertToDTO(applicantService.getAllApplicant()));
    }

    @GetMapping("/search")
    public ResponseEntity<List<ApplicantDTO>> findByNationality(@RequestParam String nationality){
        return ResponseEntity.ok(ApplicantDTO.convertToDTO(applicantService.findByNationality(nationality)));
    }

    @PutMapping("/{id}/flag")
    public ResponseEntity<ApplicantDTO> flagCriminalRecord(@PathVariable Long id){
        return ResponseEntity.ok(ApplicantDTO.convertToDTO(applicantService.flagCriminalRecord(id)));
    }
}