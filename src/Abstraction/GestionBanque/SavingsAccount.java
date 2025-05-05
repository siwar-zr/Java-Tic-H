package Abstraction.GestionBanque;

class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(String accountNumber, String ownerName, double initialBalance, double interestRate) {
        super(accountNumber, ownerName, initialBalance);
        this.interestRate = interestRate;
    }

    public void applyInterest() {
        double newBalance = getBalance() * (1 + interestRate);
        setBalance(newBalance);
    }
}