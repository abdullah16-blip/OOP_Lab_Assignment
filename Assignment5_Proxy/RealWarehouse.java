// RealWarehouse.java
public class RealWarehouse implements Warehouse {
    @Override
    public void shipProduct(String product, String destination) {
        System.out.println("Shipping " + product + " to " + destination + " from the real warehouse.");
        System.out.println();
    }
}
