package lesson03_loops.tasks;

import java.util.*;


public class Task02_faktorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int result = 1;
        int i = 1;
        if (a <= 20 && a > 0) {
            while (i <= a) {
                result = result * i;
                i++;
                System.out.printf("В итоге получаем: %d%n", result);
            }
        } else {
            System.out.print("Введено слишком большое число.");
        }

    }
}
