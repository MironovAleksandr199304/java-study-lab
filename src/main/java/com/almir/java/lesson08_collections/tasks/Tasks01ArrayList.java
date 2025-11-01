package lesson08_collections.tasks;

import java.util.*;

public class Tasks01ArrayList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Alex");
        names.add("Alina");
        names.add("Sergey");
        names.add("Diana");
        names.add("Igor");

        names.remove(3);
        System.out.println("После удаления: " + names);
        System.out.print("Содержит имя Alina? ");
        System.out.println(names.contains("Alina"));
        System.out.println("Имена в списке: ");
        for (String name : names) {
            System.out.println(name);
        }

    }
}
