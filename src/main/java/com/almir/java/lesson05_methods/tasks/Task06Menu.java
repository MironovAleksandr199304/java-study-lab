package lesson05_methods.tasks;
import java.util.*;

public class Task06Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int n = sc.nextInt();
        if (n < 1) {
            System.out.println("Длина массива не может быть меньше 1 элемента. Введите еще раз: ");
            n = sc.nextInt();
        }
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Введите значение для элемента " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        System.out.println("Выберите действие:");
        System.out.println("1 - Сумма элементов");
        System.out.println("2 - Максимум");
        System.out.println("3 - Реверс массива");

        int point_menu = sc.nextInt();

        switch (point_menu) {
            case 1 : printSum(arr);
            break;
            case 2 : printMax(arr);
            break;
            case 3 : printReverse(arr);
            break;
            default : System.out.println("Выбран неправильный пункт. Программа самоуничтожится через 3...2...1...");
        }
    }

    public static void printSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.printf("Сумма элементов равна %d%n", sum);
    }

    public static void printMax(int[] arr) {
        double max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.printf("Максимальное значение равно %.2f%n", max);
    }

    public static void printReverse(int[] arr) {

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + ", ");
        }
    }
}
