package lesson10_stream_api_and_lambdas.tasks;

import java.util.*;

public class Task07StreamMatch {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Аня");
        names.add("Ира");
        names.add("Антон");
        names.add("Борис");


        boolean name_with_a = names.stream()
                        .allMatch(k -> k.startsWith("А"));


        System.out.println("Все начинаются с А: " + name_with_a);

        boolean long_name = names.stream()
                .anyMatch(k -> k.length() > 4);

        System.out.println("Есть длинные имена: " + long_name);
    }
}
