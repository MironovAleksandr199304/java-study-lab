package lesson01_basic.tasks;

import java.util.*;

public class Task06_temp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double temp = sc.nextDouble();
        double temp_far = temp * 9 / 5 + 32;
        System.out.println("Температура по фаренгейту: " + temp_far + " (Привет, Оруэлл)");
    }
}
