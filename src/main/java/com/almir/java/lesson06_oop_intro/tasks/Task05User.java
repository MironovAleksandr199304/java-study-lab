package lesson06_oop_intro.tasks;

public class Task05User {
    public static void main(String[] args) {
        User user1 = new User("Sasha","mironovav1993@gmail.com",true);

        user1.printInfo();
        user1.deactivate();
        user1.printInfo();
    }
}
