package lesson10_stream_api_and_lambdas.tasks.advanced_tasks;

import java.util.*;

public class Task04LongestWord {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Мандарин","Музыка","Тайланд","Рефрежиратор","Пансексуальность");

        words.stream()
                .max(Comparator.comparingInt(String::length))
                .ifPresentOrElse(
                        w -> System.out.println("Самое длинное слово: " + w),
                        () -> System.out.println("EMPTY")
                );
    }
}
