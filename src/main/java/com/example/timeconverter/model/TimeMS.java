package com.example.timeconverter.model;

import lombok.*;

@Data
@Builder
public class TimeMS {
    private String abbreviation;
    private String datetime;
    private String timezone;
}

