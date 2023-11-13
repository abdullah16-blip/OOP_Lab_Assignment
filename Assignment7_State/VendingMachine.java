// Context
public class VendingMachine {
    private VendingMachineState state;

    public VendingMachine() {
        // Initial state is NoCoinState
        state = new NoCoinState(this);
    }

    public void setState(VendingMachineState state) {
        this.state = state;
    }

    public void insertCoin() {
        state.insertCoin();
    }

    public void ejectCoin() {
        state.ejectCoin();
    }

    public void selectItem() {
        state.selectItem();
    }

    public void dispenseItem() {
        state.dispenseItem();
    }
}
