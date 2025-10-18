package lesson03_loops.tasks;

import java.util.*;

public class Task06Stepen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число с плавающей точкой: ");
        double a = sc.nextDouble();
        System.out.println("Введите целое число: ");
        int n = sc.nextInt();
        double result = 1.0;

        for (int i = 1; i <= n; i++) {
            result *= a;
        }

        System.out.printf("Результат: %.4f", result);
    }
}
