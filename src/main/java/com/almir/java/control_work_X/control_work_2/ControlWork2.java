package control_work_X.control_work_2;

import java.util.Scanner;

public class ControlWork2 {
    public static void main(String[] args) {
        //переменные для конвертера
        double temp_celc;
        double km;
        double kg;
        double sum;
        double proc;
        //переменные для конвертера

        //меню
        Scanner sc = new Scanner(System.in);
        System.out.println("Меню: ");
        System.out.println("1. Перевод градусов Цельсия в Фаренгейты");
        System.out.println("2. Перевод километров в мили");
        System.out.println("3. Перевод килограммов в фунты");
        System.out.println("4. Калькуляция процента: 'дано сумма и процент' - вывести, сколько это в абсолютном вырежнии");
        System.out.println("Выберите пункт: ");
        int point = sc.nextInt();
        sc.nextLine();
        //меню

        //логика
        switch(point) {
            case 1 :
                System.out.println("Введите температуру в Цельсия: ");
                temp_celc = sc.nextDouble();
                double temp_farenh = temp_celc * 9.0/5 + 32;
                System.out.printf("%.2f градусов по Цельсия будет %.2f градусов по Фаренгейту",temp_celc,temp_farenh);
            break;
            case 2 :
                System.out.println("Введите расстояние в километрах: ");
                km = sc.nextDouble();
                double mili = km * 0.621371;
                System.out.printf("%.2f километров будет %.2f в милях", km, mili);
            break;
            case 3 :
                System.out.println("Введите вес в килограммах: ");
                kg = sc.nextDouble();
                double pound = kg * 2.20462;
                System.out.printf("%.2f килограмм будет %.2f в фунтах", kg, pound);
            break;
            case 4 :
                System.out.println("Введите сумму: ");
                sum = sc.nextDouble();
                System.out.println("Введите процент: ");
                proc = sc.nextDouble();
                double res = sum * proc / 100.0;
                System.out.printf("В абсолютном выражении это %.2f", res);
            break;
            default : System.out.println("Неизвестная ошибка, памагите");
        }
        //логика


    }
}
