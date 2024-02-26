package com.example.timeconverter.service.impl;

import com.example.timeconverter.model.TimeMS;
import com.example.timeconverter.repository.TimeMSDAO;
import com.example.timeconverter.service.TimeConverterService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
@Service
@AllArgsConstructor
public class TimeConverterServiceImpl implements TimeConverterService {
    private final TimeMSDAO repository;
    @Override
    public List<TimeMS> getCurrentTime() {
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
