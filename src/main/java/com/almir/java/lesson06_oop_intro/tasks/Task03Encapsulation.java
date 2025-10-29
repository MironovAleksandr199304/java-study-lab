package lesson06_oop_intro.tasks;

public class Task03Encapsulation {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount();

        ba.deposit(9999999.55);
        System.out.println("Еще раз, богатый буратино, твой баланс: " + ba.getBalance());
        ba.withdraw(100000.55);
        System.out.println("После покупки playstation твой баланс: " + ba.getBalance());
    }
}
