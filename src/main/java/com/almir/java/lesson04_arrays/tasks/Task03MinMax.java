package lesson04_arrays.tasks;

import java.util.*;

public class Task03MinMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int [] a = new int[sc.nextInt()];
        do {
            if (a.length < 1) {
                System.out.println("Длина массива не может быть меньше 1 элемента. Введите длину еще раз: ");
                a = new int[sc.nextInt()];
            } else {
                break;
            }
        } while (true);

        for (int i = 0; i < a.length; i++) {
            System.out.println("Введите значение для элемента " + (i+1) + " :");
            a[i] = sc.nextInt();
        }

        //логика домашки
        int min = a[0];
        int max = a[0];
        int index_max = 0;
        int index_min = 0;
        //цикл для max
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
                index_max = i;
            } else if (a[i] < min) {
                min = a[i];
                index_min = i;
            }
        }


        System.out.println("Наибольшее значение: " + max + " с индексом: " + index_max);
        System.out.println("Наименьшее значение: " + min + " с индексом: " + index_min);
        //логика домашки
    }
}
