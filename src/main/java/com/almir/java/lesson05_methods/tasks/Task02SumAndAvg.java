package lesson05_methods.tasks;

import java.util.*;

public class Task02SumAndAvg {

    public static double sumAndAverage(int[] arr) {
        double sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        double average = sum / arr.length;
        return average;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;

        do {
            System.out.println("Введите длину массива: ");
            n = sc.nextInt();
            if (n<1) {
                System.out.println("Длина массива не может быть меньше 1 элемента. Введите еще раз: ");
                n = sc.nextInt();
            } else {break;}
        } while (true);

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Введите значение для элемента " + (i+1) + " :");
            arr[i] = sc.nextInt();
        }

        double avg = sumAndAverage(arr);
        System.out.printf("Срерднее значение массива: %.2f%n", avg);

        sc.close();
    }

}
