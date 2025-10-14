package lesson02_conditions.tasks;
import java.util.*;

public class Task03_min {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        int a = sc.nextInt();
        System.out.println("Введите второе число: ");
        int b = sc.nextInt();
        System.out.println("Введите третье число: ");
        int c = sc.nextInt();

        if (a < b && a < c) {
            System.out.printf("Число %d является минимальным",a);
        } else if (b < a && b < c) {
            System.out.printf("Число %d является минимальным", b);
        } else {
            System.out.printf("Число %d является минимальным", c);
        }
    }
}
