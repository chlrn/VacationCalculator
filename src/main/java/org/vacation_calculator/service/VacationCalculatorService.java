package org.vacation_calculator.service;



import org.vacation_calculator.dto.request.VacationRequest;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;

@Service
public class VacationCalculatorService {

    private static final int WORKING_DAYS_IN_YEAR = 250;

    public BigDecimal calculateVacationCompensation(BigDecimal averageSalary, int vacationDays) {
        return averageSalary.divide(BigDecimal.valueOf(WORKING_DAYS_IN_YEAR)).multiply(BigDecimal.valueOf(vacationDays));
    }

    //you should use only one method and one api, make it depend on additional fields, if they are not empty - than do extra calculation
    public BigDecimal calculateVacationCompensationWithDates(VacationRequest vacationRequest) {
        LocalDate startDate = LocalDate.parse(vacationRequest.getStartDate());
        LocalDate endDate = LocalDate.parse(vacationRequest.getEndDate());

        // Calculate vacation days based on start and end dates (considering weekends and holidays)
        long totalVacationDays = calculateTotalVacationDays(startDate, endDate);

        return vacationRequest.getAverageSalary().divide(BigDecimal.valueOf(WORKING_DAYS_IN_YEAR)).multiply(BigDecimal.valueOf(totalVacationDays));
    }

    private long calculateTotalVacationDays(LocalDate startDate, LocalDate endDate) {
        // Logic to calculate total vacation days based on start and end dates
        return 0; // Placeholder, implement your logic here
    }
}

