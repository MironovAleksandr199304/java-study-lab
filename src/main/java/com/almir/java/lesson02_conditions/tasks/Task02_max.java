package lesson02_conditions.tasks;
import java.util.*;

public class Task02_max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int a = sc.nextInt();
        System.out.println("Введите второе число: ");
        int b = sc.nextInt();

        if (a > b) {
            System.out.printf("Число %d больше числа %d",a,b);
        } else if (b > a) {
            System.out.printf("Число %d больше числа %d",b,a);
        } else {
            System.out.printf("Числа %d и %d равны",a,b);
        }
    }
}
