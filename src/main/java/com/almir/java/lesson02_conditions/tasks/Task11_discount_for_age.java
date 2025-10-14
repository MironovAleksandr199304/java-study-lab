package lesson02_conditions.tasks;

import java.util.*;

public class Task11_discount_for_age {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите возраст: ");
        int age = sc.nextInt();
        System.out.println("Введите цену билета: ");
        double price = sc.nextDouble();
        double price_disc;
        if (age < 7) {
            System.out.println("Цена билета - бесплатно.");
        } else if (age >= 7 && age <= 18){
            price_disc= price * (1 - 50/100);
            System.out.printf("Цена билета со скидкой - %.2f%n",price_disc);
        } else if (age > 60) {
            price_disc = price * (1 - 30/100);
            System.out.printf("Цена билета со скидкой - %.2f%n", price_disc);
        } else {
            System.out.printf("Цена билета не подлежит скидке и составляет - %.2f%n", price);
        }
    }
}
