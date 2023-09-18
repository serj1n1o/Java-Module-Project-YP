import java.util.Scanner;

public class Calculator {

    double sum; // общая сумма трат
    double sumForGuest; // сумма для каждого гостя
    String listProduct = "Добавленные товары:";

    public void calculate(int people) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Какой товар будем добавлять?\nВведите название:");
            String nameProduct = scanner.next();
            if (nameProduct.equalsIgnoreCase("завершить")) {
                break;
            }
            while (true) {
                System.out.println("Введите цену:");
                double priceProduct = scanner.nextDouble();
                if (priceProduct < 0) {
                    System.out.println("Стоимость не может быть отрицательной, поробуйте еще раз");
                } else {
                    sum += priceProduct;
                    break;
                }
            }
            listProduct = listProduct + "\n" + nameProduct;
            System.out.println("Товар успешно добавлен!\nХотите добавить еще товар?\nДля завершения введите \"завершить\"");
            if (scanner.next().equalsIgnoreCase("завершить")) {
                break;
            }
        }
        sumForGuest = sum / people;

        scanner.close();
    }


}
