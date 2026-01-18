import Interface.PaymentMethod;

public class Payment {
    private final int choice;
    private final float sum;

    public Payment(int choice, float sum) {
        this.choice = choice;
        this.sum = sum;
    }

    public void paymentProcessing() {
        PaymentMethod paymentMethod = switch (choice) {
            case 1 -> new PaymentCard();
            case 2 -> new PaymentCash();
            case 3 -> new PaymentCrypt();
            default -> null;
        };
        paymentMethod.payment(sum);
    }

}
