package com.example.tra.Controllers;

import com.example.tra.Entities.Interview;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/interviews")
public class InterviewController {
    @Autowired
    private InterviewService interviewService;

    @PostMapping("/schedule/{applicantId}/{officerId}")
    public Interview schedule(
            @PathVariable Long applicantId,
            @PathVariable Long officerId,
            @RequestParam String date) {

        return interviewService.scheduleInterview(applicantId, officerId, date);
    }

    @PutMapping("/{id}/complete")
    public Interview complete(@PathVariable Long id) {
        return interviewService.completeInterview(id);
    }

    @PutMapping("/{id}/cancel")
    public String cancel(@PathVariable Long id) {
        return "Interview cancelled (not implemented in entity yet)";
    }

    @GetMapping("/officer/{officerId}/date/{date}")
    public List<Interview> getSchedule(
            @PathVariable Long officerId,
            @PathVariable String date) {

        return interviewService.getByOfficerAndDate(officerId, date);
    }
}

}
