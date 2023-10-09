public class Main {
    public static void main(String[] args) {
        BankingServiceFacade bankingService = new BankingServiceFacade();

        System.out.println("Welcome to Our Bank:");
        System.out.println("Your Checking Account Balance:");
        bankingService.checkCheckingBalance();

        System.out.println("\nYour Savings Account Balance:");
        bankingService.checkSavingBalance();

        System.out.println("\nYour Investment Account Balance:");
        bankingService.checkInvestmentBalance();
    }
}