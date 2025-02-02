import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int peopleCount = 0;

        while (peopleCount <= 1) {
            try {
                System.out.println("На сколько человек будем делить счет?");
                peopleCount = scanner.nextInt();
                if (peopleCount <= 1) {
                    System.out.println("Некорректное значение, должно быть больше одного гостя! Попробуйте еще.");
                } else if (peopleCount > 1) {
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Некорректное значение, нужно ввести количество гостей");
                scanner.nextLine();
            }
        }

        Calculator calculator = new Calculator();
        calculator.calculate(peopleCount);

        System.out.println(calculator.listProduct + "\n" + Formater.format(calculator.sumForGuest));

        scanner.close();
    }
}