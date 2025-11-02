package lesson10_stream_api_and_lambdas.tasks;

import java.util.*;

public class Task05StreamMap {
    public static void main(String[] args) {
        List <String> stack = new ArrayList<>();
        stack.add("java");
        stack.add("JUnit");
        stack.add("restAssured");
        stack.add("selenium");
        stack.add("Git");

        stack.stream()
                .map(k->k.toUpperCase())
                .filter(k -> k.length() > 4)
                .forEach(System.out::println);
    }
}
