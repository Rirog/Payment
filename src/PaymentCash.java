import Interface.PaymentMethod;

public class PaymentCash implements PaymentMethod {
    @Override
    public void payment(float sum) {
        System.out.printf("Оплата наличными на сумму %.2f успешно  прошла", sum);
    }
}
