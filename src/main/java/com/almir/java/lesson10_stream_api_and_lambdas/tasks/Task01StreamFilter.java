package lesson10_stream_api_and_lambdas.tasks;

import java.util.*;

public class Task01StreamFilter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> users = new ArrayList<>();
        System.out.println("Введите первое имя пользователя для коллекции: (для выхода введите stop)");
        String username = sc.nextLine();
        String stopChar = "stop";

        while(!username.equalsIgnoreCase(stopChar)) {
            System.out.println("Пользователь " + username + " добавлен. Введите имя следующей жертвы: ");
            users.add(username);
            username = sc.nextLine();
            if (username.equalsIgnoreCase(stopChar)) {
                break;
            }
        }
//
//        names.stream()
//                .filter(n -> n.startsWith("А"))
//                .map(String::toUpperCase)
//                .forEach(System.out::println);
        System.out.println("Имена пользователей, прошедшие фильтры: ");
        users.stream()
                        .filter(n -> n.length()>4)
                                .filter(n -> n.contains("a"))
                                        .forEach(System.out::println);
        System.out.println("Вся коллекция героев: " + users);

    }
}
