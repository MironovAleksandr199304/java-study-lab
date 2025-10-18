package lesson03_loops.tasks;

import java.util.*;

public class Task01_sum {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Введите, сколько раз будет выполняться цикл: ");
       int count = sc.nextInt();

       if (count <= 0) {
           System.out.println("Вы ввели некорректное число. Введите еще раз: ");
           count = sc.nextInt();
       }
       for (int i = 1; i <= count; i++){
           System.out.printf("Вывожу на экран: %d%n",i);
       }
    }
}
