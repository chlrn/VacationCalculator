package org.vacation_calculator.service;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Service
public class HolidayCalendarService {

    private Set<LocalDate> holidays = new HashSet<>();

    public void addHoliday(LocalDate holidayDate) {
        holidays.add(holidayDate);
    }

    public void removeHoliday(LocalDate holidayDate) {
        holidays.remove(holidayDate);
    }

    public boolean isHoliday(LocalDate date) {
        return holidays.contains(date);
    }

    public int getNumberOfHolidaysBetweenDates(LocalDate startDate, LocalDate endDate) {
        int count = 0;
        LocalDate date = startDate;
        while (!date.isAfter(endDate)) {
            if (isHoliday(date)) {
                count++;
            }
            date = date.plusDays(1);
        }
        return count;
    }
}



