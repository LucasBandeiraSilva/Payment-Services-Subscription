package model.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Client {
    private String name;
    private String email;
    private LocalDate subscrtionDate;
    private Double totalCost;
    private List<Invoice> invoicesList = new ArrayList<>();

    public Client(String name, String email, LocalDate subscriptionDate, Double totalCost) {
        this.name = name;
        this.email = email;
        this.subscrtionDate = subscriptionDate;
        this.totalCost = totalCost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getSubscrtionDate() {
        return subscrtionDate;
    }

    public Double getTotalCost() {
        return totalCost;
    }

    public List<Invoice> getInvoicesList() {
        return invoicesList;
    }

}
