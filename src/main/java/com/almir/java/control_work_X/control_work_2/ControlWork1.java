package control_work_X.control_work_2;

import java.util.*;

public class ControlWork1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите возраст пассажира");
        int age = sc.nextInt();
        System.out.println("Введите цену билета: ");
        double price = sc.nextDouble();
        sc.nextLine();
        double price_with_disc_50 = price * (1 - 50.0/100);
        double price_with_disc_30 = price * (1 - 30.0/100);

        String free_entry = (age < 7) ? "Бесплатно" : "Вход платный.";
        String full_price = (age >= 18 && age <= 59) ? "Цена билета не подлежит скидке и составляет: %.2f" : "ERROR";
        if (price > 0) {
            if (age < 7) {
                System.out.println("Категория: дошкольник");
                System.out.println(free_entry);
            } else if (age >= 7 && age <= 17) {
                System.out.println("Категория: школьник");
                System.out.printf("Вход со скидкой будет стоить %.2f", price_with_disc_50);
            } else if (age >= 18 && age <= 59) {
                System.out.println("Категория: взрослый");
                System.out.printf(full_price, price);
            } else if (age >= 60) {
                System.out.println("Категория: пенсионер");
                System.out.printf("Вход со скидкой будет стоить %.2f", price_with_disc_30);
            }
        } else {
            System.out.println("Цена билета не может быть меньше или равна нулю, введите еще раз: ");
            price = sc.nextDouble();
            if (age < 7) {
                System.out.println("Категория: дошкольник");
                System.out.println(free_entry);
            } else if (age >= 7 && age <= 17) {
                System.out.println("Категория: школьник");
                System.out.printf("Вход со скидкой будет стоить %.2f", price_with_disc_50);
            } else if (age >= 18 && age <= 59) {
                System.out.println("Категория: взрослый");
                System.out.printf(full_price, price);
            } else if (age >= 60) {
                System.out.println("Категория: пенсионер");
                System.out.printf("Вход со скидкой будет стоить %.2f", price_with_disc_30);
            }
        }
    }
}

//слабые места - если дважды ввести 0 - получим инцидент. на данный момент только один раз обрабатывается 0
