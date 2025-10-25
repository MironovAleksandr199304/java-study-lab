package lesson0600_strings.Tasks;

import java.util.*;

public class Task03SumWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите фразу: ");
        String a = sc.nextLine();

        String[] b = a.split(" ");

        System.out.println("В вашей фразе " + b.length + " слов. ЯСНО.");
//        тут я не совсем уверен, что правильно посчитало. я ввел строку:
//        привет, дорогой друг. мне уже 32 года, я женат на чудесной девушке, мы уже 3 года с лишним вместе и 1 год как женаты. Работаю я так же инженером, как и ты когда-то, только в ИТ-сфере.
//        и мне посчитало что в фразе 36 слов
    }
}
