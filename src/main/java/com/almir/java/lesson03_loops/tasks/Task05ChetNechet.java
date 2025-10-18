package lesson03_loops.tasks;

import java.util.Scanner;

public class Task05ChetNechet {
    public static void main(String[] args) {
        System.out.println("Введите сколько раз будет повторяться цикл: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int even = 0;
        int odd = 0;

        while (a > 0){
            System.out.println("Введите любое положительное число: ");
            int x = sc.nextInt();
                if (x%2==0) {
                    even++;
                } else {
                    odd++;
                }
                a--;
        }
        System.out.printf("Четных: %d%n", even);
        System.out.printf("Нечетных: %d%n",odd);
    }
}
