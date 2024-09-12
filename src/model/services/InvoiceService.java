package model.services;

import java.time.LocalDate;

import model.entities.Client;
import model.entities.Invoice;

public class InvoiceService {
    private PaymentFee paymentFee;

    public InvoiceService(PaymentFee paymentFee) {
        this.paymentFee = paymentFee;
    }

    public PaymentFee getPaymentFee() {
        return paymentFee;
    }

    public void totalInvoice(Client client,  Integer months) {
        double baseQuota = client.getTotalCost();
        for (int i = 0; i < months; i++) {
            LocalDate date = client.getSubscrtionDate().plusMonths(i);
            double payment = paymentFee.payMaintenanceFee(baseQuota);
            double totalPayment = baseQuota + payment;
            client.getInvoicesList().add(new Invoice( date, totalPayment, months));
        }
    }
}
