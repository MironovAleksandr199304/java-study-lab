package lesson04_arrays.tasks;

import java.util.*;

public class Task01CreateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите длину массива: ");
        int[] a = new int[sc.nextInt()];

        do {
            if (a.length < 1) {
                System.out.println("В массиве длина не может быть меньше 1 элемента. Введите еще раз длину массива: ");
                a = new int[sc.nextInt()];
            } else {
                break;
            }
        } while (true);

        //так, массив объявили. проверку на длину добавили. теперь заполнение

        for (int i = 0; i < a.length; i++) {
            System.out.println("Введите значение для " + (i + 1) + " элемента в массив: ");
            a[i] = sc.nextInt();
        }

        System.out.println("Длина массива: " + a.length);
        System.out.println("Сам массив: " + Arrays.toString(a));
    }
}
