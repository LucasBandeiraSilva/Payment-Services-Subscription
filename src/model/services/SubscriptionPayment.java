package model.services;

public class SubscriptionPayment implements PaymentFee {
    private static final double FEE_MAINTENANCE = 0.05;

    @Override
    public Double payMaintenanceFee(Double amount) {
        return amount *  FEE_MAINTENANCE;
    }

}
