package lesson06_oop_intro.tasks;

public class User {
    String username;
    String email;
    boolean isActive;

    public User(String username, String email, boolean isActive) {
        this.username = username;
        this.email = email;
        this.isActive = isActive;
    }

    public String getEmail(){
        return email;
    }

    public void deactivate() {
        isActive = false;
        System.out.printf("Пользователь %s деактивирован%n",username);
    }

    public void printInfo(){
        System.out.printf("Имя: %s%n", username);
        System.out.printf("Email: %s%n",email);
        System.out.printf("Статус: %b%n",isActive);
    }
}
