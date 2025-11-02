package lesson10_stream_api_and_lambdas.tasks.advanced_tasks;

import java.util.*;

public class Task03CountWords {
    public static void main(String[] args) {
        List <String> words = Arrays.asList("Апельсин", "Ананас", "Торнадо", "Ежик", "Коктейль", "Нос");

        long count = words.stream()
                    .filter(word -> word.startsWith("А") || word.startsWith("а"))
                    .count();

        System.out.printf("Всего слов, начинающихся на 'А' или 'а' : %d", count);
    }
}
