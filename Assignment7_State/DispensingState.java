// Concrete State
public class DispensingState implements VendingMachineState {
    private VendingMachine vendingMachine;

    public DispensingState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Cannot insert coin while dispensing");
    }

    @Override
    public void ejectCoin() {
        System.out.println("Cannot eject coin while dispensing");
    }

    @Override
    public void selectItem() {
        System.out.println("Cannot select item while dispensing");
    }

    @Override
    public void dispenseItem() {
        System.out.println("Item dispensed");
        vendingMachine.setState(new NoCoinState(vendingMachine));
    }
}
