package lesson04_arrays.tasks;

import java.util.*;

public class Task02SumAndAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        double [] a = new double[sc.nextInt()];

        do {
            if (a.length < 1) {
                System.out.println("Длина массива не может быть меньше 1 элемента. Введите длину массива еще раз: ");
                a = new double[sc.nextInt()];
            } else {
                break;
            }
        } while (true);

        for (int i = 0; i < a.length; i++) {
            System.out.println("Введите значение для массива " + (i + 1) + " :");
            a[i] = sc.nextDouble();
        }

        //теперь логика домашки
        //сумма всех элементов
        double sum = 0;
        for (int i = 0; i < a.length; i++){
            sum += a[i];
        }
        System.out.println("Сумма всех элементов в массиве: " + sum);
        //сумма всех элементов
        //среднее арифметическое (сумму элементов делим на количество)
        System.out.println("Среднее арифметическое равно: " + sum/a.length);
        //среднее арифметическое
        //логика домашки завершена
    }
}
