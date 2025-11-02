package lesson10_stream_api_and_lambdas.tasks.advanced_tasks;

import java.util.*;

public class Task02SquareEvenNum {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(2,3,4,5,6,7,8,9,10);

        nums.stream()
                .filter( num -> num % 2 == 0)
                .map(num -> num * num)
                .sorted()
                .forEach(System.out::println);

    }
}
