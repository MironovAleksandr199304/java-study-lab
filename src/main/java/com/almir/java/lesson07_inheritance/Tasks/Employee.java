package lesson07_inheritance.Tasks;

public class Employee extends Person {
    String position;
    public Employee(String name, int age, String position) {
        super(name,age);
        this.position = position;
    }

    @Override
    public void introduce() {
        super.introduce();
        System.out.printf("Я работаю как %s%n",position);
    }
}
