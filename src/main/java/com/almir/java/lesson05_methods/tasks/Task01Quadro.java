package lesson05_methods.tasks;

import java.util.*;

public class Task01Quadro {
    public static int square(int a) {
        return a * a;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        int n = sc.nextInt();
        System.out.println("Квадрат числа " + n + " равен: " + square(n));
    }
}
