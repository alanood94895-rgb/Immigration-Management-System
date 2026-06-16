package com.example.tra.Controllers;

import com.example.tra.Entities.ImmigrationCenter;
import com.example.tra.Repositories.CenterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/centers")
public class CenterController {

    @Autowired
    private CenterRepository centerRepository;

    @PostMapping
    public ImmigrationCenter createCenter(@RequestBody ImmigrationCenter center) {
        return centerRepository.save(center);
    }

    @GetMapping("/{id}")
    public ImmigrationCenter getCenter(@PathVariable Long id) {
        return centerRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Center not found"));
    }

}
