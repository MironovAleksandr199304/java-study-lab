package lesson08_collections.tasks;

import java.util.*;

public class Task03HashMap {
    public static void main(String[] args) {
        Map<String,Integer> stock = new HashMap<>();
        stock.put("SKU-001",10);
        stock.put("SKU-002",3);
        stock.put("SKU-003",0);
        stock.put("SKU-004",7);
        stock.put("SKU-005",15);

        stock.put("SKU-002",8);
        stock.remove("SKU-003");
        System.out.println("Получай решение, я иду за баблом и статусом AQA!");
        System.out.println(stock);
        System.out.println("А вот размер карты!");
        System.out.println(stock.size());
        System.out.println("В коллекции есть ключ SKU-003???" + stock.containsKey("SKU-003"));
        System.out.println(stock.getOrDefault("SKU-005",0));

        for (Map.Entry<String,Integer> e : stock.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }

        int sum = 0;
        for (int val : stock.values()) {
            sum += val;
        }

        System.out.println("Итого на складе: " + sum);

        String maxKey = "";
        int maxValue = Integer.MIN_VALUE;

        for (Map.Entry<String, Integer> e : stock.entrySet()) {
            if (e.getValue() > maxValue) {
                maxValue = e.getValue();
                maxKey = e.getKey();
            }
        }
        System.out.println("Максимум: " + maxKey + " -> " + maxValue);
    }
}
