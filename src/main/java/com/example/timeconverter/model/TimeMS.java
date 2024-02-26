package com.example.timeconverter.model;

import lombok.*;

@Data
@Builder
public class TimeMS {
    private String abbreviation;
    private String clientIP;
    private String dateTime;
    private int dayWeak;
    private int dayYear;
    private boolean dst;
    private String dstFrom;
    private int dstOffset;
    private String dstUntil;
    private int rawOffset;
    private String timezone;
    private int unixTime;
    private String utsDateTime;
    private String utsOffset;
    private int weekNumber;


}
