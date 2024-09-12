package model.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Invoice {
    private LocalDate expirationDate;
    private Double totalCost;
    private Integer monthsSubscription;

    private static final DateTimeFormatter formater = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Invoice(LocalDate expirationDate, Double totalCost, Integer monthsSubscription) {
        this.expirationDate = expirationDate;
        this.totalCost = totalCost;
        this.monthsSubscription = monthsSubscription;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    public Double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(Double totalCost) {
        this.totalCost = totalCost;
    }

    public Integer getMonthsSubscription() {
        return monthsSubscription;
    }

    public void setMonthsSubscription(Integer monthsSubscription) {
        this.monthsSubscription = monthsSubscription;
    }

    @Override
    public String toString() {
        return "expirationDate=" + formater.format(expirationDate) + ", totalCost="
                + String.format("%.2f", getTotalCost());
    }

}
