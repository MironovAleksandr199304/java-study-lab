package lesson0600_strings.Tasks;

import java.util.*;

public class Task05Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите фразу: ");
        String a = sc.nextLine();
        System.out.println("Ввод: " + a);

        String reverse = "";
        a = a.toLowerCase().replace(" ","");
        for (int i = a.length() - 1; i >= 0; i--) {
            reverse += a.charAt(i);
        }
        if (a.equals(reverse)) {
            System.out.println("Палиндром");
        } else {
            System.out.println("Не палиндром");
        }

        //эту задачу по сути решил с подсказкой, почти что с готовым решением
         //но во первых я не успел отложить в голове, что по индексам в случае
         //строк надо писать charAt, а не a[i] как в случае с массивом чисел
         //а во вторых мне интересно, как работает equals
         //он прям посимвольно сравнивает? не условно целое слово. хотя
         //с другой стороны откуда машина знает, где начало и конец слова
        //так что логично, что посимвольно сравнение идет
    }
}
