package lesson01_basic.tasks;

import java.util.Scanner;

public class Task02_console {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String username;
        username = sc.nextLine();
        System.out.println("Имя пользователя: " + username);
    }
}