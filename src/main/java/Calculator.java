import java.util.Scanner;

public class Calculator {
    Scanner scanner = new Scanner(System.in);
    double sum; // общая сумма трат
    double sumForGuest; // сумма для каждого гостя
    String listProduct = "Добавленные товары:";
    public void calculate(int peoples){

        while(true) {
            System.out.println("Какой товар будем добавлять?\nВведите название:");
            String nameProduct = scanner.next();
                if (nameProduct.equalsIgnoreCase("завершить")){ //если вдруг человек ошибся в вводе слова Завершить,еще одна возможность
                    break;
                }
            System.out.println("Введите цену:");
            double priceProduct = scanner.nextDouble();
            Product product = new Product(nameProduct, priceProduct); // получается, что этот класс нам пока не нужен
            sum += priceProduct;
            listProduct = listProduct + "\n" + nameProduct;
            System.out.println("Товар успешно добавлен!\nХотите добавить еще товар?\nДля завершения введите \"завершить\"");
                if (scanner.next().equalsIgnoreCase("завершить")) {
                    break;
                }
        }
        sumForGuest = sum / peoples;


    }

}
