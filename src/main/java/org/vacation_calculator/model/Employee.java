package org.vacation_calculator.model;

import java.math.BigDecimal;

public class Employee {

    private String name;
    private BigDecimal averageSalary;
    private int vacationDays;

    public Employee() {
    }

    public Employee(String name, BigDecimal averageSalary, int vacationDays) {
        this.name = name;
        this.averageSalary = averageSalary;
        this.vacationDays = vacationDays;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getAverageSalary() {
        return averageSalary;
    }

    public void setAverageSalary(BigDecimal averageSalary) {
        this.averageSalary = averageSalary;
    }

    public int getVacationDays() {
        return vacationDays;
    }

    public void setVacationDays(int vacationDays) {
        this.vacationDays = vacationDays;
    }
}