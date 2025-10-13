package lesson01_basic.tasks;

import java.util.*;

public class Task15_calc_procent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double proc = sc.nextDouble();
        double res = proc * (1 + a);

        System.out.println("Через год на вкладе будет: " + res);
    }
}