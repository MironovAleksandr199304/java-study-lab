package lesson03_loops.tasks;

import java.util.*;

public class Task04SumPositive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = 0;
        do {
            System.out.println("Введите число: ");
            int a = sc.nextInt();
            if (a == 0) {
                break;
            } else if (a > 0) {
                result += a;
                System.out.println("Если вы хотите выйти из цикла - введите 0");
            }
        }
        while (true);

        System.out.println(result);
    }
}
