package lesson03_loops.tasks;

import java.util.*;

public class Task07Diapozon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int a = sc.nextInt();
        System.out.println("Введите второе число (должно быть больше первого числа): ");
        int b = sc.nextInt();
        int result = 0;

        while (b <= a) {
            System.out.println("Второе число не может быть меньше или равно первого. Введите еще раз: ");
            b = sc.nextInt();
        }

        for (int i = a; i <= b; i++) {
            System.out.printf("Выводим число: %d%n",i);
            if (i%3==0) {
                result += i;
            }
        } System.out.printf("Сумма кратных 3 = %d",result);
    }
}
