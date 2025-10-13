package control_work_X.control_work_1;

import java.util.*;

public class console_calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        double a = sc.nextDouble();
        System.out.println("Введите второе число: ");
        double b = sc.nextDouble();
        sc.nextLine();
        System.out.println("Введите знак операции: ");
        String c = sc.nextLine();

        if (b == 0) {
            System.out.println("Деление на 0 невозможно, введите еще раз делитель: ");
            b = sc.nextDouble();
        }

        double res;

        if (c.equals("+")) {
            res = a + b;
            System.out.printf("Результат: %.2f%n", res);
        } else if (c.equals("-")) {
            res = a - b;
            System.out.printf("Результат: %.2f%n", res);
        } else if (c.equals("*")) {
            res = a * b;
            System.out.printf("Результат: %.2f%n", res);
        } else if (c.equals("/")) {
            res = a / b;
            System.out.printf("Результат: %.2f%n", res);
        }

    }
}
