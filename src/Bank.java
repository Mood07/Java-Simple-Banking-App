import java.util.ArrayList;
import java.util.List;

public class Bank {

    private List<Account> accounts = new ArrayList<>();

    public void addAccount(Account account) {
        accounts.add(account);
        System.out.println("🏦 Account created successfully.");
    }

    public Account findAccount(String accountNumber) {
        for (Account acc : accounts) {
            if (acc.getAccountNumber().equals(accountNumber)) {
                return acc;
            }
        }
        return null;
    }

    public void listAccounts() {
        if (accounts.isEmpty()) {
            System.out.println("⚠ No accounts found.");
            return;
        }

        System.out.println("\n📋 Registered Accounts:");
        for (Account acc : accounts) {
            System.out.println(acc);
        }
    }

    public void transfer(String fromAccNum, String toAccNum, double amount) {
        Account from = findAccount(fromAccNum);
        Account to = findAccount(toAccNum);

        if (from == null || to == null) {
            System.out.println("❌ One or both account numbers are invalid.");
            return;
        }

        if (amount <= 0) {
            System.out.println("⚠ Transfer amount must be greater than zero.");
            return;
        }

        // withdraw → deposit
        double oldBalance = from.getBalance();
        from.withdraw(amount);

        // If withdraw fails, do not transfer
        if (from.getBalance() == oldBalance) {
            System.out.println("❌ Transfer failed.");
            return;
        }

        to.deposit(amount);
        System.out.println("🔁 Transfer complete!");
    }
}
