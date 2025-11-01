package lesson08_collections.tasks;

import java.util.*;

public class Task02HashSet {
    public static void main(String[] args) {
        Set<String> tags = new HashSet<>();
        tags.add("QA");
        tags.add("Java");
        tags.add("Test");
        tags.add("QA");
        tags.add("Selenium");
        System.out.println("Содержимое коллекции tags: " + tags);
        System.out.println("Его размер: " + tags.size());
        System.out.println("Не затесалось ли в нем нашего непримиримого врага, этого языка для домохозяек? ");
        System.out.println(tags.contains("Python") + "! он остался для желающих вкатиться в айти за 3 недели.");
    }
}
