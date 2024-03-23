package org.vacation_calculator.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.vacation_calculator.dto.request.VacationRequest;
import org.vacation_calculator.service.VacationCalculatorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class VacationCalculationController {

    private final VacationCalculatorService vacationCalculatorService;

    public VacationCalculationController(VacationCalculatorService vacationCalculatorService) {
        this.vacationCalculatorService = vacationCalculatorService;
    }

    @GetMapping("/calculate")
    public BigDecimal calculateVacationCompensation(@RequestParam BigDecimal averageSalary, @RequestParam int vacationDays) {
        return vacationCalculatorService.calculateVacationCompensation(averageSalary, vacationDays);
    }

    //naming of urls need to be with underscores, e.g. calculate_with_dates
    @GetMapping("/calculateWithDates")
    public BigDecimal calculateVacationCompensationWithDates(VacationRequest vacationRequest) {
        return vacationCalculatorService.calculateVacationCompensationWithDates(vacationRequest);
    }
}

