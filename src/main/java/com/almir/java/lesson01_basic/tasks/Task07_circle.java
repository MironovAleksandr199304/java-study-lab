package lesson01_basic.tasks;

import java.util.*;

public class Task07_circle {
    public static void main(String[] args) {
        double pi = 3.14;
        Scanner sc = new Scanner(System.in);
        int radius = sc.nextInt();

        double S = pi * radius * radius;
        System.out.println("Радиус круга равен: " + S);
    }
}
