package lesson01_basic.tasks;

import java.util.*;

public class Task11_calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите рост в метрах: ");
        double height = sc.nextDouble();
        System.out.print("Введите вес в кг: ");
        double massa = sc.nextDouble();

        double BMI = massa / (height * height);

        System.out.printf("BMI этого человека: %.2f%n",BMI);
    }
} //получается 0, я хз почему