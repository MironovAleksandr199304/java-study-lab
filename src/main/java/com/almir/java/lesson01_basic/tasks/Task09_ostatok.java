package lesson01_basic.tasks;

import java.util.*;

public class Task09_ostatok {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int res = a%b;
        System.out.println("Остаток от деления: " + res);
    }
}
