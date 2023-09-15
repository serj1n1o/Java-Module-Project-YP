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

        Calculator calculator = new Calculator();
        calculator.calculate(howManyPeople);

        System.out.println(calculator.listProduct);
        System.out.println("Каждый гость должен заплатить: " + calculator.sumForGuest + " рублей");

        scanner.close();
    }
}