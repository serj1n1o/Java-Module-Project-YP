import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {

    double sum; // общая сумма трат
    double sumForGuest; // сумма для каждого гостя
    String listProduct = "Добавленные товары:";

    public void calculate(int people) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Какой товар будем добавлять?\nВведите название:");
            String nameProduct = scanner.nextLine();
            if (nameProduct.equalsIgnoreCase("завершить")) {
                break;
            }

            while (true) {
                System.out.println("Введите цену:");
                double priceProduct = 0;
                try {
                    priceProduct = scanner.nextDouble();
                    scanner.nextLine();
                    if (priceProduct < 0) {
                        System.out.println("Стоимость не может быть отрицательной, поробуйте еще раз");
                    } else {
                        sum += priceProduct;
                        break;
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Введите корректное значение");
                    scanner.nextLine();
                }
            }

            listProduct = listProduct + "\n" + nameProduct;
            System.out.println("Товар успешно добавлен!\nХотите добавить еще товар?\nДля завершения введите \"завершить\"");
            if (scanner.nextLine().equalsIgnoreCase("завершить")) {
                break;
            }
        }
        sumForGuest = sum / people;

        scanner.close();
    }


}
