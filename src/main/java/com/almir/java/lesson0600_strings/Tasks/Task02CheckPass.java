package lesson0600_strings.Tasks;

import java.util.*;

public class Task02CheckPass {
    public static void main(String[] args) {
        String correct_pass = "qwerty";
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите пароль: ");
        String user_pass = sc.nextLine();

        if (user_pass.equals(correct_pass)){
            System.out.println("Доступ разрешен. Добро пожаловать, житель убежища 77");
        } else {
            System.out.println("Пароль неверный. Вы будете ликвидированы через 3...2...1...");
        }
    }
}
