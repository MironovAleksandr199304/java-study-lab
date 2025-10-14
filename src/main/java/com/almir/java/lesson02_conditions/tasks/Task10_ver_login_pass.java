package lesson02_conditions.tasks;

import java.util.*;

public class Task10_ver_login_pass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String correct_login = "admin";
        String correct_password = "12345";
        System.out.println("Введите логин: ");
        String entry_login = sc.nextLine();
        System.out.println("Введите пароль: ");
        String entry_password = sc.nextLine();

        if (entry_login.equals(correct_login) && entry_password.equals(correct_password)){
            System.out.println("Доступ разрешен");
        } else {
            System.out.println("Ошибка входа");
        }
    }
}
