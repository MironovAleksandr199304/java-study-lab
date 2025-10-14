package lesson02_conditions.tasks;

import java.util.*;

public class Task09_tabel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите оценку ученика: ");
        int a = sc.nextInt();

        switch(a) {
            case 5 :
                System.out.println("Отлично");
                break;
            case 4 :
                System.out.println("Хорошо");
                break;
            case 3 :
                System.out.println("Удовлетворительно");
                break;
            case 2, 1 :
                System.out.println("Плохо");
                break;
            default :
                System.out.println("Некорректная оценка");
        }
    }
}
