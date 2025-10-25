package lesson0600_strings.Tasks;

import java.util.*;

public class Task04ReplaceLowCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите предложение: ");
        String a = sc.nextLine();
        System.out.println("Ввод: " + a);
        a = a.toLowerCase().replace(" ","_");
        System.out.println("Вывод: " + a);
    }
}
