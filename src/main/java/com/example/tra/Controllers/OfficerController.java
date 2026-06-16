package com.example.tra.Controllers;

import com.example.tra.Entities.BorderControlOfficer;
import com.example.tra.Entities.ImmigrationOfficer;
import com.example.tra.Repositories.OfficerRepository;
import com.example.tra.Services.OfficerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/officers")
public class OfficerController {
    @Autowired
    private OfficerService officerService;

    @Autowired
    private OfficerRepository officerRepository;

    @PostMapping
    public ImmigrationOfficer hireOfficer(@RequestBody ImmigrationOfficer officer) {
        return officerRepository.save(officer);
    }

    @PostMapping("/border")
    public BorderControlOfficer hireBorderOfficer(@RequestBody BorderControlOfficer officer) {
        return officerRepository.save(officer);
    }

    @GetMapping("/{id}")
    public ImmigrationOfficer getOfficer(@PathVariable Long id) {
        return officerRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Officer not found"));
    }

    @PutMapping("/{id}/promote")
    public ImmigrationOfficer promoteOfficer(
            @PathVariable Long id,
            @RequestParam String rank,
            @RequestParam int clearance) {

        return officerService.promoteOfficer(id, rank, clearance);
    }

    @PutMapping("/transfer/{centerId}")
    public ImmigrationOfficer transferOfficer(
            @RequestParam Long officerId,
            @PathVariable Long centerId) {

        return officerService.transferOfficer(officerId, centerId);
    }
}
}
