package lesson06_oop_intro.tasks;

public class Car {
    String brand;
    int year;

    public Car(String brand,int year) {
        this.brand = brand;
        this.year = year;
    }

    public void printInfo() {
            System.out.printf("Марка: %s, год выпуска: %d%n", brand, year);
        }
}
