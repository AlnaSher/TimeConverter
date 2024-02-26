package com.example.timeconverter.service.impl;

import com.example.timeconverter.model.TimeMS;
import com.example.timeconverter.repository.TimeMSDAO;
import com.example.timeconverter.service.TimeConverterService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.client.RestTemplate;

import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

@Service
@AllArgsConstructor
public class TimeConverterServiceImpl implements TimeConverterService {
    private final TimeMSDAO repository;
    @Override
    public List<TimeMS> getCurrentTime() {
        ZoneId currentTimeZone = ZoneId.systemDefault();
        String timezoneString = currentTimeZone.getId();

        ZoneOffset gmtOffset = OffsetDateTime.now().getOffset();
        String gmtOffsetString = gmtOffset.toString();

        ZonedDateTime currentTime = ZonedDateTime.now();
        ZonedDateTime gmtTime = currentTime.withZoneSameInstant(ZoneId.ofOffset("GMT", gmtOffset));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String gmtTimeString = gmtTime.format(formatter);

        TimeMS timeMS = new TimeMS(gmtTimeString, gmtOffsetString, timezoneString);

        repository.saveTime(timeMS);
        return repository.getCurrentTime();
    }

    @Override
    public TimeMS saveTime(TimeMS time) {
        return repository.saveTime(time);
    }

    @Override
    public TimeMS findByTimezone(String timezone) {
        return repository.findByTimezone(timezone);
    }

    @Override
    public TimeMS updateTime(TimeMS time) {
        return repository.updateTime(time);
    }

    @Override
    public void deleteTime(String timezone) {
        repository.deleteTime(timezone);
    }
}
