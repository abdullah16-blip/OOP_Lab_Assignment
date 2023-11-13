// OnlineRetailStore.java
public class OnlineRetailStore {
    private Warehouse warehouse;

    public OnlineRetailStore(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public void processOrder(String product, String destination) {
        System.out.println("Processing order for " + product + " to be shipped to " + destination);
        warehouse.shipProduct(product, destination);
    }
}
