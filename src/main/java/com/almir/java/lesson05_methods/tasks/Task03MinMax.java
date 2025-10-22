package lesson05_methods.tasks;

import java.util.*;

public class Task03MinMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int a = sc.nextInt();
        if (a < 1) {
            System.out.println("Длина массива не может быть меньше 1 элемента. Введите еще раз: ");
            a = sc.nextInt();
        }
        int[] arr = new int[a];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Введите значение для элемента " + (i+1) + " :");
            arr[i] = sc.nextInt();
        }

        int min = findMin(arr);
        int max = findMax(arr);

        System.out.println("Минимальное значение массива: " + min);
        System.out.println("Максимальное значение массива: " + max);
    }

    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
