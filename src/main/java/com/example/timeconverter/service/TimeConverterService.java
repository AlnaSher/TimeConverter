package com.example.timeconverter.service;

import com.example.timeconverter.model.TimeMS;

import java.util.List;


public interface TimeConverterService {
    List<TimeMS> getCurrentTime();
    TimeMS saveTime(TimeMS time);
    TimeMS findByTimezone(String timezone);
    TimeMS updateTime(TimeMS time);
    void deleteTime(String timezone);
}
