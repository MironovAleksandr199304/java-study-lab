package lesson01_basic.tasks;

import java.util.*;

public class Task14_concat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите имя человека: ");
        String name = sc.nextLine();
        System.out.println("Введите фамилию человека: ");
        String family = sc.nextLine();
        System.out.println("Имя и фамилия человека: " + name + " " + family);
    }
}
