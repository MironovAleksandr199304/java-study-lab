package lesson01_basic.tasks;

import java.util.*;

public class Task13_perimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int height = sc.nextInt();
        int weight = sc.nextInt();

        int perimeter = 2 * (height + weight);
        System.out.println("Периметр прямоугольника: " + perimeter);
    }
}
