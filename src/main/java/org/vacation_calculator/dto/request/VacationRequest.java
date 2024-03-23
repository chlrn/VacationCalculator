package org.vacation_calculator.dto.request;
import java.math.BigDecimal;

/* there are 3 layers
    - dto layer that works with client (requests and responses)
    - model - that our business (and not only business, maybe calculation) models to work with inside services
    - dao - model to wrap up data from db (when save or get something)
 */
public class VacationRequest {

    private BigDecimal averageSalary;
    private int vacationDays;
    private String startDate;
    private String endDate;

    public VacationRequest() {
    }

    public VacationRequest(BigDecimal averageSalary, int vacationDays, String startDate, String endDate) {
        this.averageSalary = averageSalary;
        this.vacationDays = vacationDays;
        this.startDate = startDate;
        this.endDate = endDate;
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

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
}
