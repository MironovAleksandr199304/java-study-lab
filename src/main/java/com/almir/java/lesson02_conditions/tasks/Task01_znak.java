package lesson02_conditions.tasks;

import java.util.*;

public class Task01_znak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (a < 0 ) {
            System.out.printf("Число %d является отрицательным",a);
        } else if (a == 0) {
            System.out.printf("Число %d равно нулю", a);
        } else {
            System.out.printf("Число %d является положительным", a);
        }
    }
}
