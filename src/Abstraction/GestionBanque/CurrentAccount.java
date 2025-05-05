package Abstraction.GestionBanque;

class CurrentAccount extends Account {
    private double overdraftLimit;

    public CurrentAccount(String accountNumber, String ownerName, double initialBalance, double overdraftLimit) {
        super(accountNumber, ownerName, initialBalance);
        this.overdraftLimit = overdraftLimit;
    }

    public void setOverdraftLimit(double limit) {
        this.overdraftLimit = limit;
    }

    @Override
    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= (getBalance() + overdraftLimit)) {
            setBalance(getBalance() - amount);
            return true;
        }
        return false;
    }
}