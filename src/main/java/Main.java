import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int howManyPeople = 0;
        while (howManyPeople <= 1 ){
            System.out.println("На сколько человек будем делить счет?");
            howManyPeople = scanner.nextInt();
            if(howManyPeople <= 1){
                System.out.println("Некоректное значение, должно быть больше одного гостя! Попробуйте еще.");
            } else if (howManyPeople > 1) {
                break;
            }
        }

//        System.out.println("Какой товар будем добавлять?\nВведите название:");
//        String nameProduct = scanner.next();
//        System.out.println("Введите цену в рублях с копейками:");
//        double priceProduct = scanner.nextDouble();
//        Product product = new Product(nameProduct, priceProduct);



        Calculator calculator = new Calculator();
        calculator.calculate(howManyPeople);

        System.out.println(calculator.listProduct);
        System.out.println(calculator.sum / howManyPeople);
//        System.out.println(product.name + " " + product.price + "рублей");


        scanner.close();
    }
}