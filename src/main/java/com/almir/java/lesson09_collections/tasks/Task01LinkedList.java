package lesson09_collections.tasks;

import java.util.*;

public class Task01LinkedList {
    public static void main(String[] args) {
        LinkedList<String> lnlist = new LinkedList<>();
        lnlist.addFirst("Хлеб");
        lnlist.addLast("Молоко");
        lnlist.addFirst("Яблоки");
        lnlist.addLast("Сыр");
        lnlist.addFirst("Кофе");

        System.out.println("Список покупок: " + lnlist);
        lnlist.remove(3);
        System.out.println("После покупки молока, осталось купить: " + lnlist);
    }
}
