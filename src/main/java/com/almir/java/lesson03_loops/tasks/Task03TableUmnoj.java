package lesson03_loops.tasks;

import java.util.Scanner;

public class Task03TableUmnoj {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите целое число от 1 до 10");
        int a = sc.nextInt();

        for(int i = 1; i <= 10; i++){
            int result = a * i;
            System.out.printf("%d * %d = %d%n",a,i,result);
        }
    }
}
