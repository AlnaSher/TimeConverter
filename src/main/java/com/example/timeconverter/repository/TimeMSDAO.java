package com.example.timeconverter.repository;

import com.example.timeconverter.model.TimeMS;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
@Repository
public class TimeMSDAO {
    private final List<TimeMS> times = new ArrayList<>();
    public List<TimeMS> getCurrentTime() {
        return times;
    }

    public TimeMS saveTime(TimeMS time) {
        times.add(time);
        return time;
    }

    public TimeMS findByTimezone(String timezone) {
        return times.stream().filter(element->element.getTimezone().equals(timezone))
                .findFirst().orElse(null);
    }

    public TimeMS updateTime(TimeMS time) {
        var timeIndex = IntStream.range(0, times.size())
                .filter(index->times.get(index).getTimezone().equals(time.getTimezone()))
                .findFirst().orElse(-1);
        if(timeIndex > -1){
            times.set(timeIndex, time);
            return time;
        }
        return null;
    }

    public void deleteTime(String timezone) {
        var time = findByTimezone(timezone);
        if(time != null){
            times.remove(time);
        }
    }
}
