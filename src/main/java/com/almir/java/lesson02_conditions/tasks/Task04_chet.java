package lesson02_conditions.tasks;

import java.util.*;

public class Task04_chet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        String res = (a % 2 == 0) ? "Четное" : "Нечетное";
        System.out.print(res);
    }
}
