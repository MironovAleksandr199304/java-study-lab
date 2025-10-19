package lesson04_arrays.tasks;

import java.util.*;

public class Task05Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int a = sc.nextInt();

        do {
            if (a < 1) {
                System.out.println("Массив не может быть меньше 1 элемента. Введите размер еще раз: ");
                a = sc.nextInt();
            } else {
                break;
            }
        } while (true);

        int [] arr = new int[a];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Введите значения для элемента " + (i+1) + " :");
            arr[i] = sc.nextInt();
        }

        System.out.println("Массив после реверса: ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + ", ");
        }

    }
}
