import Interface.PaymentMethod;

public class PaymentCard implements PaymentMethod {
    @Override
    public void payment(float sum) {
        System.out.printf("Оплата картой на сумму %.2f прошла успешно", sum);
    }
}
