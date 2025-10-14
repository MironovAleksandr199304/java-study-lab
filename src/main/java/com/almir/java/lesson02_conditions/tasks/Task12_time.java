package lesson02_conditions.tasks;

import java.util.*;

public class Task12_time {
    public static void main(String[] args) {
        System.out.println("Введите час: ");
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();

        if (hour >= 0 && hour <= 23) {
            switch(hour) {
                case 0,1,2,3,4,5 :
                    System.out.println("Ночь");
                    break;
                case 6,7,8,9,10,11 :
                    System.out.println("Утро");
                    break;
                case 12,13,14,15,16,17 :
                    System.out.println("День");
                    break;
                case 18,19,20,21,22,23 :
                    System.out.println("Вечер");
                    break;
                default :
                    System.out.println("До этого кейса программа вряд ли дойдёт — но пусть будет, на всякий случай.");
                    break;
            }
        } else {
            System.out.println("Ладно, пускай дойдет. Неверно введен час, запускай заново");
        }
    }
}
