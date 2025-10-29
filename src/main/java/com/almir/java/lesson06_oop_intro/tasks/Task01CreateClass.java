package lesson06_oop_intro.tasks;

public class Task01CreateClass {

    public static void main(String[] args) {

        Car car1 = new Car("Toyota",1998);
        car1.printInfo();

        Car car2 = new Car("Zaporojes",1970);
        car2.printInfo();
    }

}

