package lesson09_collections.tasks;

import java.util.*;

public class Task02QueueProcessor {
    public static void main(String[] args) {
        Queue<String> tasksList = new LinkedList<>();
        tasksList.add("Открыть сайт");
        tasksList.add("Авторизоваться");
        tasksList.add("Перейти в профиль");
        tasksList.add("Изменить настройки");
        tasksList.add("Выйти из системы");

        while(!tasksList.isEmpty()) {
            System.out.println("Выполняем шаг: " + tasksList.poll());
        }

        System.out.println("Все шаги выполнены.");
    }
}
