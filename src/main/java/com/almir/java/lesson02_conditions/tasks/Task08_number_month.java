package lesson02_conditions.tasks;

import java.util.*;

public class Task08_number_month {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите номер месяца: ");
        int a = sc.nextInt();

        switch (a) {
            case 12,1,2 :
                System.out.println("Зима");
                break;
            case 3,4,5 :
                System.out.println("Весна");
                break;
            case 6,7,8 :
                System.out.println("Лето");
                break;
            case 9,10,11 :
                System.out.println("Осень");
                break;
        }
    }
}
