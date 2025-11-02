package lesson10_stream_api_and_lambdas.tasks.advanced_tasks;

import java.util.*;

public class Task05AverageAboveThreshold {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(3,4,5,6,11,23,-5,100,94,99);

            double avg = nums.stream()
                .filter(num -> num > 10)
                .mapToInt(Integer::intValue).average().orElse(0.0);

        System.out.printf("Среднее значение: %.2f",avg);
    }
}
