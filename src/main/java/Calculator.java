import java.util.Scanner;

public class Calculator {
    Scanner scanner = new Scanner(System.in);
    double sum;
    String listProduct = "Добавленные товары:";
    public void calculate(int peoples){

        while(true) {
            System.out.println("Какой товар будем добавлять?\nВведите название:");
            String nameProduct = scanner.next();
            System.out.println("Введите цену:");
            double priceProduct = scanner.nextDouble();
            Product product = new Product(nameProduct, priceProduct);
            sum += priceProduct;
            listProduct = listProduct + "\n" + nameProduct;
            System.out.println("Товар успешно добавлен!\nХотите добавить еще товар?\n Для завершения введите \"Завершить\"");
                if (scanner.next().equalsIgnoreCase("завершить")) {
                    break;
                }
        }

    }
}
