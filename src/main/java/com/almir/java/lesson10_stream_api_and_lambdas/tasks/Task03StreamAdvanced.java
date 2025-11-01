package lesson10_stream_api_and_lambdas.tasks;

import java.util.*;
import java.util.stream.Collectors;

public class Task03StreamAdvanced {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();

        nums.add(4);
        nums.add(4);
        nums.add(1);
        nums.add(398);

        List<Integer> evenSortedDistinct = nums.stream()
                .distinct()
                .sorted()
                .filter(k -> k%2 == 0)
                .collect(Collectors.toList());

        long count = evenSortedDistinct.size();
        int sum = evenSortedDistinct.stream()
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("Уникальные четные по возрастанию: " + evenSortedDistinct);
        System.out.println("Количество: " + count);
        System.out.println("Сумма: " + sum);
    }
}
