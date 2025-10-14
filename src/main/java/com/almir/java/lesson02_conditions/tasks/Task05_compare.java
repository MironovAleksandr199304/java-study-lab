package lesson02_conditions.tasks;

import java.util.*;

public class Task05_compare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();

        if (a.equals(b)){
            System.out.printf("Слова '%s' и '%s' являются одинаковыми", a, b);
        } else {
            System.out.printf("Слова '%s' и '%s' не являются одинаковыми", a ,b);
        }
    }
}
