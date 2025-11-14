import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);
    private static final Bank bank = new Bank();

    public static void main(String[] args) {

        boolean running = true;

        System.out.println("===================================");
        System.out.println("        Simple Banking App         ");
        System.out.println("===================================");

        while (running) {
            printMenu();
            int choice = readInt("Choose an option: ");

            switch (choice) {
                case 1:
                    createSavingsAccount();
                    break;
                case 2:
                    createCheckingAccount();
                    break;
                case 3:
                    depositMoney();
                    break;
                case 4:
                    withdrawMoney();
                    break;
                case 5:
                    transferMoney();
                    break;
                case 6:
                    applyInterest();
                    break;
                case 7:
                    bank.listAccounts();
                    break;
                case 0:
                    running = false;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }

        scanner.close();
    }

    private static void printMenu() {
        System.out.println("\n----------- MENU -----------");
        System.out.println("1 - Create Savings Account");
        System.out.println("2 - Create Checking Account");
        System.out.println("3 - Deposit Money");
        System.out.println("4 - Withdraw Money");
        System.out.println("5 - Transfer Money");
        System.out.println("6 - Apply Interest (Savings)");
        System.out.println("7 - List All Accounts");
        System.out.println("0 - Exit");
        System.out.println("----------------------------");
    }

    private static void createSavingsAccount() {
        scanner.nextLine();

        System.out.print("Owner name: ");
        String name = scanner.nextLine();

        System.out.print("Account number: ");
        String accNum = scanner.nextLine();

        double balance = readDouble("Initial balance: ");
        double rate = readDouble("Interest rate (0.05 = 5%): ");

        SavingsAccount sa = new SavingsAccount(accNum, name, balance, rate);
        bank.addAccount(sa);
    }

    private static void createCheckingAccount() {
        scanner.nextLine();

        System.out.print("Owner name: ");
        String name = scanner.nextLine();

        System.out.print("Account number: ");
        String accNum = scanner.nextLine();

        double balance = readDouble("Initial balance: ");
        double limit = readDouble("Overdraft limit: ");

        CheckingAccount ca = new CheckingAccount(accNum, name, balance, limit);
        bank.addAccount(ca);
    }

    private static void depositMoney() {
        scanner.nextLine();
        System.out.print("Account number: ");
        String accNum = scanner.nextLine();

        Account acc = bank.findAccount(accNum);
        if (acc == null) {
            System.out.println("Account not found.");
            return;
        }

        double amount = readDouble("Amount: ");
        acc.deposit(amount);
    }

    private static void withdrawMoney() {
        scanner.nextLine();
        System.out.print("Account number: ");
        String accNum = scanner.nextLine();

        Account acc = bank.findAccount(accNum);
        if (acc == null) {
            System.out.println("Account not found.");
            return;
        }

        double amount = readDouble("Amount: ");
        acc.withdraw(amount);
    }

    private static void transferMoney() {
        scanner.nextLine();

        System.out.print("From account: ");
        String from = scanner.nextLine();

        System.out.print("To account: ");
        String to = scanner.nextLine();

        double amount = readDouble("Amount: ");

        bank.transfer(from, to, amount);
    }

    private static void applyInterest() {
        scanner.nextLine();
        System.out.print("Savings account number: ");
        String accNum = scanner.nextLine();

        Account acc = bank.findAccount(accNum);
        if (acc == null) {
            System.out.println("Account not found.");
            return;
        }

        if (acc instanceof SavingsAccount) {
            ((SavingsAccount) acc).applyInterest();
        } else {
            System.out.println("This is not a Savings Account.");
        }
    }

    private static int readInt(String msg) {
        while (true) {
            System.out.print(msg);
            try {
                return scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Enter a valid number.");
                scanner.nextLine();
            }
        }
    }

    private static double readDouble(String msg) {
        while (true) {
            System.out.print(msg);
            try {
                return scanner.nextDouble();
            } catch (Exception e) {
                System.out.println("Enter a valid amount.");
                scanner.nextLine();
            }
        }
    }
}
