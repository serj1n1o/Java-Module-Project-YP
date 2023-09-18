import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int peopleCount = 0;
        while (peopleCount <= 1) {
            System.out.println("На сколько человек будем делить счет?");
            peopleCount = scanner.nextInt();
            if (peopleCount <= 1) {
                System.out.println("Некоректное значение, должно быть больше одного гостя! Попробуйте еще.");
            } else if (peopleCount > 1) {
                break;
            }
        }

        Calculator calculator = new Calculator();
        calculator.calculate(peopleCount);

        System.out.println(calculator.listProduct + "\n" + Formater.format(calculator.sumForGuest));

        scanner.close();
    }
}