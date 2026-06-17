package com.example.tra.DTOs;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CenterDTO {
    private Long id;
    private String name;
    private String locationCountry;
    private String type;
    private int dailyCapacity;
}
