package com.example.timeconverter.repository;

import com.example.timeconverter.model.TimeMS;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
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
        for (TimeMS element : times) {
            if (element.getTimezone().equals(timezone)) {
                return element;
            }
        }
        return null;
    }

    public TimeMS updateTime(TimeMS time) {
        int timeIndex = -1;
        for (int index = 0; index < times.size(); index++) {
            if (times.get(index).getTimezone().equals(time.getTimezone())) {
                timeIndex = index;
                break;
            }
        }
        if (timeIndex != -1) {
            times.set(timeIndex, time);
            return time;
        }
        return null;
    }

    public void deleteTime(String timezone) {
        TimeMS time = findByTimezone(timezone);
        if (time != null) {
            times.remove(time);
        }
    }
}
