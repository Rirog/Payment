import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choice;
        float sum = 0;

            do {
                try {
                System.out.println("""
                        Payment
                        1 - Оплата картой;
                        2 - Оплата наличными;
                        3 - Оплата криптовалютой.
                        0 - Выход""");

                choice = scanner.nextInt();

                if (choice == 0) {
                    scanner.close();
                    System.exit(0);
                }

                if (choice > 0 && choice < 4) {

                    System.out.print("Хотите изменить способ оплаты? (Y) : "); //Неважно, что можно любой символ ввести и он пройдет
                    scanner.nextLine();

                    if (scanner.nextLine().equalsIgnoreCase("y")) choice = 0;

                    System.out.println("Введите сумму платежа");

                    sum = scanner.nextFloat();
                    if (sum <= 0) {
                        System.out.println("Введенна некорректная сумма");
                        choice = 0;
                    }
                }
                } catch (InputMismatchException e) {
                    System.err.println("Некорректный ввод");
                    scanner.nextLine();
                    choice = 0;
                    sum = 0;
                }
            } while (choice > 3 || choice < 1);

        Payment payment = new Payment(choice, sum);
        payment.paymentProcessing();

    }
}