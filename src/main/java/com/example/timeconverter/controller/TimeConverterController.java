package com.example.timeconverter.controller;

import com.example.timeconverter.model.TimeMS;
import com.example.timeconverter.service.TimeConverterService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/api/v1/time")
@AllArgsConstructor
public class TimeConverterController {
    private final TimeConverterService service;
    @GetMapping
    public List<TimeMS> getCurrentTime(){

        return service.getCurrentTime();
    }
    @PostMapping("save_time")
    public TimeMS saveTime(@RequestBody TimeMS time){
        return service.saveTime(time);
    }
    @GetMapping("/{timezone}")
    public TimeMS findByTimezone(@PathVariable String timezone){
        return service.findByTimezone(timezone);
    }
    @PutMapping("update_time")
    public TimeMS updateTime(@RequestBody TimeMS time){
        return service.updateTime(time);
    }
    @DeleteMapping("delete_time/{timezone}")
    public void deleteTime(@PathVariable String timezone){
        service.deleteTime(timezone);
    }
}
