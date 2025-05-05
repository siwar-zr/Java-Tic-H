package Abstraction.GestionBanque;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank(10); // max 10 comptes

        Account savings = new SavingsAccount("SA123", "Sonia", 1000, 0.05);
        Account current = new CurrentAccount("CA456", "Mouhamed", 500, 200);

        bank.addAccount(savings);
        bank.addAccount(current);

        bank.deposit("SA123", 200);
        bank.withdraw("CA456", 700);
        ((SavingsAccount)savings).applyInterest();

        bank.displayBalance("SA123");
        bank.displayBalance("CA456");

        bank.withdraw("CA456", 100);
        bank.withdraw("AD589",200);
    }
}
