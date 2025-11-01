package lesson10_stream_api_and_lambdas.tasks;

import java.util.*;

public class Tasks02StreamMap {
    public static void main(String[] args) {
        Map<String, String> result = new HashMap<>();
        result.put("LoginTest","passed");
        result.put("LogoutTest","failed");
        result.put("ProfileTest","passed");
        result.put("PaymentTest","failed");
        result.put("SettingsTest","passed");

        System.out.println("Все тесты, завершившиеся удачно: ");
        result.entrySet().stream()
                .filter(v -> v.getValue().equals("passed"))
                .map(Map.Entry::getKey)
                .forEach(System.out::println);

        long failedCount = result.entrySet().stream()
                .filter(v -> v.getValue().equals("failed"))
                .count();

        System.out.println("Количество неудачно завершившихся тестов: " + failedCount);
    }
}
