package control_work_X.control_work_2;

import java.util.Scanner;

public class ControlWork3 {
    public static void main(String[] args) {
        //константы
        final String ADM_LOGIN = "admin";
        final String PASS = "qwerty";
        final String PROFILE_ADMIN = "ADMIN";
        final String PROFILE_USER = "USER";
        //константы
        //Scanner
        Scanner sc = new Scanner(System.in);
        //Scanner

        //логика
        System.out.println("Введите логин: ");
        String entry_login = sc.nextLine();
        System.out.println("Введите пароль: ");
        String entry_pass = sc.nextLine();
        if (entry_pass.length() < 5) {
            System.out.println("Слишком короткий пароль(минимум 5 знаков), введите еще раз: ");
            entry_pass = sc.nextLine();
            }
        if (entry_login.equalsIgnoreCase(ADM_LOGIN) && entry_pass.equalsIgnoreCase(PASS)) {
            System.out.println("Выберите профиль: ADMIN или USER");
            String profile = sc.nextLine();
            if (profile.isBlank()) {
                System.out.println("Поле профиля пустое. Выберите профиль еще раз: ADMIN или USER");
                profile = sc.nextLine();
            }
            if (profile.equalsIgnoreCase(PROFILE_ADMIN)) {
                System.out.println("Здравствуйте, администратор!");
            } else if (profile.equalsIgnoreCase(PROFILE_USER)) {
                System.out.println("Здравствуйте, пользователь!");
            } else {
                System.out.println("Неизвестный профиль");
            }
            //логика
        } else {
            System.out.println("Некорректный логин или пароль");
        }
    }
}
