package lesson01_basic.tasks;

import java.util.*;

public class Task10_discount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double price = sc.nextDouble();
        double discount = sc.nextDouble();

        double disc_price = price * (1 - discount/100);
        System.out.printf("Цена со скидкой: %.2f руб.%n", disc_price);
    }
}
