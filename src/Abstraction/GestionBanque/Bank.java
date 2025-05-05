package Abstraction.GestionBanque;

class Bank {
    private Account[] accounts;
    private int count; // nombre de comptes ajoutés

    public Bank(int maxAccounts) {
        accounts = new Account[maxAccounts];
        count = 0;
    }

    public boolean addAccount(Account account) {
        if (count < accounts.length) {
            accounts[count] = account;
            count++;
            return true;
        }
        return false; // tableau plein
    }

    public boolean deposit(String accountNumber, double amount) {
        for (int i = 0; i < count; i++) {
            if (accounts[i].getAccountNumber().equals(accountNumber)) {
                accounts[i].deposit(amount);
                return true;
            }
        }
        return false; // compte non trouvé
    }

    public void withdraw(String accountNumber, double amount) {
        for (int i = 0; i < count; i++) {
            if (accounts[i].getAccountNumber().equals(accountNumber)) {
                if (accounts[i].withdraw(amount)) {
                    System.out.println("Money withdrawn successfully");
                } else {
                    System.out.println("Not enough credit");
                }
                return; // compte trouvé, on sort de la méthode
            }
        }
        System.out.println("Account not found");
    }

    public void displayBalance(String accountNumber) {
        for (int i = 0; i < count; i++) {
            if (accounts[i].getAccountNumber().equals(accountNumber)) {
                System.out.println("Solde du compte " + accountNumber + " : " + accounts[i].getBalance());
                return;
            }
        }
        System.out.println("Compte " + accountNumber + " non trouvé.");
    }
}