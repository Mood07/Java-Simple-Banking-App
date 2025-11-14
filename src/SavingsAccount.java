public class SavingsAccount extends Account {

    private double interestRate; // In % (e.g.: 0.05 = 5%)

    public SavingsAccount(String accountNumber, String ownerName, double balance, double interestRate) {
        super(accountNumber, ownerName, balance);
        this.interestRate = interestRate;
    }

    public void applyInterest() {
        double interest = balance * interestRate;
        balance += interest;
        System.out.println("📈 Interest applied: $" + interest + " | New Balance: $" + balance);
    }

    public double getInterestRate() {
        return interestRate;
    }

    @Override
    public String toString() {
        return "[Savings Account] " +
                "Account Number: " + accountNumber +
                " | Owner: " + ownerName +
                " | Balance: $" + balance +
                " | Interest Rate: " + (interestRate * 100) + "%";
    }
}
