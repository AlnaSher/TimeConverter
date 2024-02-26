package com.example.timeconverter.model;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
public class TimeMS {
    private String datetime;
    private String abbreviation;
    private String timezone;
}

