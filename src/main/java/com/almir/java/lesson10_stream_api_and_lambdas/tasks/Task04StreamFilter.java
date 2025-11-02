package lesson10_stream_api_and_lambdas.tasks;

import java.util.*;

public class Task04StreamFilter {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(5);
        nums.add(-2);
        nums.add(3);
        nums.add(-4);
        nums.add(1);
        nums.add(-7);

        System.out.println("Исходные " + nums);

        nums.stream()
                .filter(n -> n < 0)
                .map(n -> n * n)
                .sorted()
                .forEach(System.out::println);
    }
}
