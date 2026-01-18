import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choice;
        float sum = 0;

        do {
            System.out.println("""
                        Payment
                        1 - Оплата картой;
                        2 - Оплата наличными;
                        3 - Оплата криптовалютой.
                        0 - Выход""");

            choice = scanner.nextInt();

            if (choice ==  0) {
                scanner.close();
                System.exit(0);
            }

            System.out.print("Хотите изменить способ оплаты? (Y/N) : ");
            scanner.nextLine();

            if (scanner.nextLine().equalsIgnoreCase("y")) choice = 0;

            if (choice > 0 && choice < 4) {
                System.out.println("Введите сумму платежа");
                sum = scanner.nextFloat();

                if (sum <= 0){
                    System.out.println("Введенна некорректная сумма");
                    choice = 0;
                }
            }
        } while (choice > 3 || choice < 1);

        scanner.close();
        Payment payment = new Payment(choice, sum);
        payment.paymentProcessing();

    }
}