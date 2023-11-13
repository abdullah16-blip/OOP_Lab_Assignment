// Concrete State
public class NoCoinState implements VendingMachineState {
    private VendingMachine vendingMachine;

    public NoCoinState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Coin inserted");
        vendingMachine.setState(new HasCoinState(vendingMachine));
    }

    @Override
    public void ejectCoin() {
        System.out.println("No coin to eject");
    }

    @Override
    public void selectItem() {
        System.out.println("Please insert a coin");
    }

    @Override
    public void dispenseItem() {
        System.out.println("Please insert a coin before selecting an item");
    }
}
