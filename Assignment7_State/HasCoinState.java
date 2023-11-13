// Concrete State
public class HasCoinState implements VendingMachineState {
    private VendingMachine vendingMachine;

    public HasCoinState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Coin already inserted");
    }

    @Override
    public void ejectCoin() {
        System.out.println("Coin ejected");
        vendingMachine.setState(new NoCoinState(vendingMachine));
    }

    @Override
    public void selectItem() {
        System.out.println("Item selected");
        vendingMachine.setState(new DispensingState(vendingMachine));
    }

    @Override
    public void dispenseItem() {
        System.out.println("Please select an item first");
    }
}
