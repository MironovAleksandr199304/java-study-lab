package lesson07_inheritance.Tasks;

public class Person {
    String name;
    int age;

    public Person (String name, int age) {
        this.name = name;
        this.age = age;

    }
    public void introduce() {
        System.out.printf("Меня зовут %s, мне %d лет.%n", name, age);
    }
}
