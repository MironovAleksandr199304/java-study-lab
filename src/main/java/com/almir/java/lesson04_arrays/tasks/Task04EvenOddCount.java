package lesson04_arrays.tasks;

import java.util.*;

public class Task04EvenOddCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int [] a = new int[sc.nextInt()];

        do {
            if (a.length < 1) {
                System.out.println("Длина массива не может быть меньше 1 элемента. Введите еще раз: ");
                a = new int[sc.nextInt()];
            } else {
                break;
            }
        } while (true);

        int even = 0;
        int odd = 0;

        for (int i = 0; i < a.length; i++) {
            System.out.println("Введите значение для элемента " + (i+1) + " :");
            a[i] = sc.nextInt();

            //логика домашки
            switch (a[i] % 2) {
                case  0 :
                    even++;
                    break;
                case 1:
                    case -1:
                        odd++;
                        break;
            }
            //логика домашки
        }

        System.out.printf("Четные: %d%n",even);
        System.out.printf("Нечетные: %d%n", odd);

    }
}
