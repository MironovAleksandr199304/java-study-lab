package lesson04_arrays.tasks;

import java.util.*;

public class Task06Palindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите размер массива: ");
        int a = sc.nextInt();
        do {
            if (a < 1) {
                System.out.println("Размер массива не может быть меньше 1 элемента. Введите еще раз: ");
                a = sc.nextInt();
            } else {
                break;
            }
        } while (true);

        int[] arr = new int[a];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Введите значение для элемента " + (i + 1) + " :");
            arr[i] = sc.nextInt();
        }

        int[] revers_arr = new int[a];
        for (int i = arr.length - 1; i >= 0; i--) {
            revers_arr[i] = arr[arr.length - 1 - i];
        }

        boolean isPalindrome = true;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != revers_arr[i]) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("Массив является палиндромом");
        } else {
            System.out.println("Массив не является палиндромом");
        }

    }
}
