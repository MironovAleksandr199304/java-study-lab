package lesson05_methods.tasks;

import java.util.*;

public class Task05Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Введите длину массива: ");
        do {
            n = sc.nextInt();
            if (n < 1) {
                System.out.println("Длина массива не может быть меньше 1 элемента. Введите еще раз: ");
                n = sc.nextInt();
            }
        } while (n < 1);

        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Введите значение для элемента " + (i + 1) + " :");
            arr[i] = sc.nextInt();
        }

        boolean result = isPalindrome(arr);

        if (result) {
           System.out.println("Массив является палиндромом, йоу!");
        } else {
            System.out.println("Массив не является палиндромом :(");
        }

    }

    public static boolean isPalindrome(int[] arr) {
        for (int i = 0; i < arr.length - 1 - i; i++) {
            if (arr[i] != arr[arr.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }
}
