import Interface.PaymentMethod;

public class PaymentCrypt implements PaymentMethod {
    @Override
    public void payment(float sum) {
        System.out.printf("Оплата криптовалютой на сумму %.2f успешно прошла", sum);
    }
}
