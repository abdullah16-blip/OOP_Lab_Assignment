// Client Code
public class VendingMachineDemo {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();

        vendingMachine.insertCoin();
        vendingMachine.selectItem();
        vendingMachine.dispenseItem();

        vendingMachine.ejectCoin();
        vendingMachine.selectItem();
        vendingMachine.dispenseItem();
    }
}
