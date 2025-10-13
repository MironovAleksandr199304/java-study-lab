package lesson01_basic.tasks;

import java.util.Scanner;

public class Task03_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int res = a + b;
        System.out.println("Сумма числа " + a + " и числа " + b + " = " + res);
    }
}
