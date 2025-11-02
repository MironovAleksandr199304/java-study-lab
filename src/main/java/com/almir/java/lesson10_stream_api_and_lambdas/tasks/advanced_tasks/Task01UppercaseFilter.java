package lesson10_stream_api_and_lambdas.tasks.advanced_tasks;

import java.util.*;

public class Task01UppercaseFilter {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("cat","Java","QA","stream","SQL");

        words.stream()
                .filter(word -> word.length() > 3)
                .map(k -> k.toUpperCase())
                .sorted()
                .forEach(System.out::println);
    }
}
