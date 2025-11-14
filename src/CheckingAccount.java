public class CheckingAccount extends Account {

    private double overdraftLimit; // Additional account limit

    public CheckingAccount(String accountNumber, String ownerName, double balance, double overdraftLimit) {
        super(accountNumber, ownerName, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("⚠ Amount must be greater than zero.");
            return;
        }

        if (amount > balance + overdraftLimit) {
            System.out.println("❌ Withdrawal denied. Amount exceeds overdraft limit.");
            return;
        }

        balance -= amount;
        System.out.println("💸 Withdrawal successful (Checking Account). New Balance: $" + balance);
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    @Override
    public String toString() {
        return "[Checking Account] " +
                "Account Number: " + accountNumber +
                " | Owner: " + ownerName +
                " | Balance: $" + balance +
                " | Overdraft Limit: $" + overdraftLimit;
    }
}
