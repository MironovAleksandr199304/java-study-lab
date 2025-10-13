package lesson01_basic.tasks;

import java.util.*;

public class Task08_dog_age {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите возраст собаки: ");
        int age = sc.nextInt();
        int age_conv_human = age * 7;
        System.out.println("Возраст собаки по человеческим меркам: " + age_conv_human);
    }
}
