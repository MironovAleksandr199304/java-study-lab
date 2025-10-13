package lesson01_basic.tasks;

import java.util.Scanner;

public class Task04_avg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double res = (a+b+c)/3;
        System.out.println("Среднее арифметическое суммы чисел " + a + ", " + b + ", " + c + ": " + res );
    }
}
