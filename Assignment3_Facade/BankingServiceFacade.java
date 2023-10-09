public class BankingServiceFacade {
    private CheckingModule checkingModule;
    private SavingsModule savingsModule;
    private InvestmentModule investmentModule;

    public BankingServiceFacade() {
        checkingModule = new CheckingModule();
        savingsModule = new SavingsModule();
        investmentModule = new InvestmentModule();
    }

    public void checkCheckingBalance() {
        checkingModule.checkBalance();
    }

    public void checkSavingBalance() {
        savingsModule.checkBalance();
    }

    public void checkInvestmentBalance() {
        investmentModule.checkBalance();
    }
}