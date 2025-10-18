package lesson03_loops.tasks;

import java.util.Scanner;

public class Task08Tabel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    do {
        int score = sc.nextInt();
        if (score < 1 || score > 5) {
            System.out.println("Введена некорректная оценка. Введите еще раз: ");
            score = sc.nextInt();
        }
             switch (score) {
                case 1 : System.out.println("Плохо");
                break;
                case 2 : System.out.println("Плохо");
                break;
                case 3 : System.out.println("Удовлетворительно");
                break;
                case 4 : System.out.println("Хорошо");
                break;
                case 5 : System.out.println("Отлично");
                break;
            };
        break;
    }   while (true);

    }
}


//### Задача 8. Ввод до корректного значения (do-while)
//Запрашивай оценку по пятибалльной шкале, пока пользователь не введёт число от 1 до 5.
// Затем выведи текст:
// - 5 — «Отлично», 4 — «Хорошо», 3 — «Удовлетворительно», 2/1 — «Плохо».