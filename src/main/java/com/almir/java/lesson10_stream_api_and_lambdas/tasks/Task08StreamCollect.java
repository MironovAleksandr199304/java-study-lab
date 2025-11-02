package lesson10_stream_api_and_lambdas.tasks;

import java.util.*;
import java.util.stream.Collectors;

public class Task08StreamCollect {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(10,15,20,25,30,35);

        Set<Integer> result = nums.stream()
                .filter( k -> k%5 == 0 && k%10 != 0)
                .collect(Collectors.toSet());

        System.out.println("Результат: " + result);

    }
}
