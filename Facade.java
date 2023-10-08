import java.util.Scanner;

// 1: Creating individual Account classes
class CheckingAccount {
    public int getBalance() {
        // balance for checking account
        return 1000;
    }
}

class SavingsAccount {
    public int getBalance() {
        // balance for savings account
        return 5000;
    }
}

class InvestmentAccount {
    public int getBalance() {
        // balance for investment account
        return 20000;
    }
}

// 2: Creating a facade class to simplify the interface
class BankingServiceFacade {
    private CheckingAccount checkingAccount;
    private SavingsAccount savingsAccount;
    private InvestmentAccount investmentAccount;

    public BankingServiceFacade() {
        checkingAccount = new CheckingAccount();
        savingsAccount = new SavingsAccount();
        investmentAccount = new InvestmentAccount();
    }

    public int getAccountBalance(String accountType) {
        switch (accountType) {
            case "checking":
                return checkingAccount.getBalance();
            case "savings":
                return savingsAccount.getBalance();
            case "investment":
                return investmentAccount.getBalance();
            default:
                return -1; // Invalid account type
        }
    }
}

// 3: Using the facade class to access the accounts
public class Facade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankingServiceFacade bankingService = new BankingServiceFacade();

        System.out.println("Choose an account to check balance (checking, savings, investment):");
        String accountType = scanner.nextLine();

        int balance = bankingService.getAccountBalance(accountType);

        if (balance >= 0) {
            System.out.println(accountType + " Account Balance: $" + balance);
        } else {
            System.out.println("Invalid account type.");
        }
    }
}
