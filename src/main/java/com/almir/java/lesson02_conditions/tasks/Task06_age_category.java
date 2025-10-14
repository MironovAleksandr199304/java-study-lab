package lesson02_conditions.tasks;

import java.util.*;

public class Task06_age_category {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if (age < 7) {
            System.out.printf("Возраст %d зачислен в категорию 'дошкольник'",age);
        } else if (age >= 7 && age <= 17) {
            System.out.printf("Возраст %d зачислен в категорию 'школьник'",age);
        } else if (age >= 18 && age <= 22) {
            System.out.printf("Возраст %d зачислен в категорию 'студент'", age);
        } else if (age >= 23 && age <= 59) {
            System.out.printf("Возраст %d зачислен в категорию 'взрослый'", age);
        } else {
            System.out.printf("Возраст %d зачислен в категорию 'пенсионер'", age);
        }

    }
}
