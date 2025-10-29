package lesson07_inheritance.Tasks;

public class Tasks02ConcSuper {
    public static void main(String[] args) {
        Person person = new Person("Sasha",32);
        Employee employee = new Employee("Sasha",32,"QA");

        person.introduce();
        employee.introduce();
    }
}
