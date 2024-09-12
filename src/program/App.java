package program;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Client;
import model.entities.Invoice;
import model.services.InvoiceService;
import model.services.SubscriptionPayment;

public class App {
    public static void main(String[] args) {
        DateTimeFormatter formater = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter with the following data: ");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("E-mail: ");
        String email = scanner.nextLine();
        System.out.print("Subscription date (dd/mm/yyy): ");
        LocalDate subscriptionDate = LocalDate.parse(scanner.nextLine(), formater);
        System.out.print("Amount: ");
        double amount = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Subscription months: ");
        int months = scanner.nextInt();
        scanner.nextLine();

        Client client = new Client(name, email, subscriptionDate,amount);
        InvoiceService invoiceService = new InvoiceService(new SubscriptionPayment());
        invoiceService.totalInvoice(client, months);

        System.out.println("INVOICE DATA:");
        for (Invoice invoice : client.getInvoicesList()) {
            System.out.println(invoice);
        }
        scanner.close();

    }
}
