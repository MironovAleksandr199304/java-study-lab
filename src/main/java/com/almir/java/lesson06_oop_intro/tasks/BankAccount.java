package lesson06_oop_intro.tasks;

public class BankAccount {
    private double balance;

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Пополнено на: " + amount + ". Баланс: " + balance);
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Не пытайся меня надурить, дурилка.");
        } else {
            balance -= amount;
            System.out.println("Снято с баланса: " + amount + ". Баланс: " + balance);
        }
    }

    public double getBalance() {
        return balance;
    }

}
