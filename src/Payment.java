import Interface.PaymentMethod;

public class Payment {
    private final int choice;
    private final float sum;

    public Payment(int choice, float sum) {
        this.choice = choice;
        this.sum = sum;
    }

    public void paymentProcessing() {
        PaymentMethod paymentMethod;
        switch (choice) {
            case 1:
                paymentMethod = new PaymentCard();
                paymentMethod.payment(sum);
                break;
            case 2:
                paymentMethod = new PaymentCash();
                paymentMethod.payment(sum);
                break;
            case 3:
                paymentMethod = new PaymentCrypt();
                paymentMethod.payment(sum);
                break;
        }
    }

}
