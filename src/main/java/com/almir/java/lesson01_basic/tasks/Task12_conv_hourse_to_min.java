package lesson01_basic.tasks;

import java.util.*;

public class Task12_conv_hourse_to_min {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min = sc.nextInt();
        int hour = min / 60;
        int ostatok_min = min%60;
        if (hour == 2 || hour == 3 || hour == 4) {
            System.out.print(min + " минут в часах и минутах равно: " + hour + " часа и " + ostatok_min + " минут.");
        } else if (hour == 1) {
            System.out.print(min + " минут в часах и минутах равно: " + hour + " час и " + ostatok_min + " минут.");
        } else {
            System.out.print(min + " минут в часах и минутах равно: " + hour + " часов и " + ostatok_min + " минут.");
        }
    }
}
