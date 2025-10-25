package lesson0600_strings.Tasks;

import java.util.*;

public class Task01Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите город проживания: ");
        String city = sc.nextLine();
        System.out.println("Введите Ваше имя: ");
        String name = sc.nextLine();
        System.out.println("Привет, " + name + " из города " + city);
    }

}
