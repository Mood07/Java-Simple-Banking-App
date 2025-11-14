public class Account {

    protected String accountNumber;
    protected String ownerName;
    protected double balance;

    public Account(String accountNumber, String ownerName, double balance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("⚠ Amount must be greater than zero.");
            return;
        }
        balance += amount;
        System.out.println("💰 Deposit successful. New Balance: $" + balance);
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("⚠ Amount must be greater than zero.");
            return;
        }

        if (amount > balance) {
            System.out.println("❌ Insufficient funds.");
            return;
        }

        balance -= amount;
        System.out.println("💸 Withdrawal successful. New Balance: $" + balance);
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    @Override
    public String toString() {
        return "Account Number: " + accountNumber +
                " | Owner: " + ownerName +
                " | Balance: $" + balance;
    }
}
