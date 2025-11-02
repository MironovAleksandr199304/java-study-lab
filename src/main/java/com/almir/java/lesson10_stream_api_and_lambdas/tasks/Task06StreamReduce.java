package lesson10_stream_api_and_lambdas.tasks;

import java.util.*;

public class Task06StreamReduce {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(3);
        nums.add(8);
        nums.add(12);
        nums.add(5);
        nums.add(7);

        int sum = nums.stream()
                .reduce(0,(a,b) -> a + b);
        int res = nums.stream()
                .reduce(1,(a,b) -> a * b);
        System.out.println("Сумма: " + sum);
        System.out.println("Произведение: " + res);
    }
}
