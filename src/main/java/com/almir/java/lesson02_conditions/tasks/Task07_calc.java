package lesson02_conditions.tasks;

import java.util.*;

public class Task07_calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int a = sc.nextInt();
        sc.nextLine();
        System.out.println("Введите знак операции: ");
        String znak = sc.nextLine();
        System.out.println("Введите второе число: ");
        int b = sc.nextInt();
        sc.nextLine();
        int res;

        if (b == 0) {
            System.out.println("Деление на 0 невозможно, введите делитель еще раз: ");
            b = sc.nextInt();
            res = a / b;
            System.out.printf("Результат деления числа %d на число %d равен %d",a,b,res);
        } else if (znak.equals("+")){
            res = a + b;
            System.out.printf("Результат сложения чисел %d и %d равен %d",a,b,res);
        } else if (znak.equals("-")) {
            res = a - b;
            System.out.printf("Результат вычитания чисел %d и %d равен %d",a,b,res);
        } else if (znak.equals("*")){
            res = a * b;
            System.out.printf("Результат умножения числа %d на число %d равен %d",a,b,res);
        }else if (znak.equals("/")){
            res = a/b;
            System.out.printf("Результат деления числа %d на число %d равен %d",a,b,res);
        } else {
            System.out.println("Введен неверный знак операции, введите еще раз: ");
            znak = sc.nextLine();
            if (b == 0) {
                System.out.println("Деление на 0 невозможно, введите делитель еще раз: ");
                b = sc.nextInt();
                res = a / b;
                System.out.printf("Результат деления числа %d на число %d равен %d",a,b,res);
            } else if (znak.equals("+")){
                res = a + b;
                System.out.printf("Результат сложения чисел %d и %d равен %d",a,b,res);
            } else if (znak.equals("-")) {
                res = a - b;
                System.out.printf("Результат вычитания чисел %d и %d равен %d",a,b,res);
            } else if (znak.equals("*")){
                res = a * b;
                System.out.printf("Результат умножения числа %d на число %d равен %d",a,b,res);
            }else if (znak.equals("/")) {
                res = a / b;
                System.out.printf("Результат деления числа %d на число %d равен %d", a, b, res);
            }
        }
    }
}
